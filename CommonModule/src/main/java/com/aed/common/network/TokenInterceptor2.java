package com.aed.common.network;


import android.text.TextUtils;

import com.aed.common.network.common.Commons;
import com.aed.common.tools.DeviceUtil;
import com.aed.common.tools.MD5Utils;
import com.aed.common.tools.UserInfoManager;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by sk on 2018/7/10.
 */

public class TokenInterceptor2 implements Interceptor {
    private final String TAG = "TokenInterceptor";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request oldRequest = chain.request();
        // 新的请求,添加参数
        Request newRequest = addParam(oldRequest);
        Response response = chain.proceed(newRequest);
        return response;
    }

    /**
     * 添加公共参数
     *
     * @param oldRequest
     * @return
     */
    private Request addParam(Request oldRequest) {
        Request newRequest;
        //请求定制：添加请求头
        Request.Builder requestBuilder = oldRequest.newBuilder();
        long time = System.currentTimeMillis();
        String password;
        String aed;
        password =  userId+"||"+time+"||"+Commons.SALT_FOR_USER;
        aed = userId+"."+time+"."+ MD5Utils.md5Password(password);

        if(oldRequest.body() instanceof FormBody){
            FormBody.Builder newFormBody = new FormBody.Builder();
            FormBody oidFormBody = (FormBody) oldRequest.body();
            for (int i = 0;i<oidFormBody.size();i++){
                newFormBody.addEncoded(oidFormBody.encodedName(i),oidFormBody.encodedValue(i));
            }
            newFormBody.add("version",DeviceUtil.getAppVersionName(HttpUtil.context));
            requestBuilder.method(oldRequest.method(),newFormBody.build());

            newRequest= requestBuilder.addHeader("NYLON",aed).build();
        }else {
            HttpUrl.Builder builder = oldRequest.url()
                    .newBuilder()
                    .setEncodedQueryParameter("version", DeviceUtil.getAppVersionName(HttpUtil.context));

            newRequest = oldRequest.newBuilder().addHeader("NYLON", aed)
                    .method(oldRequest.method(), oldRequest.body())
                    .url(builder.build())
                    .build();
        }
        return newRequest;
    }
    private String userId;
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
