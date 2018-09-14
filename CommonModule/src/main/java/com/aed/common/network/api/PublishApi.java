package com.aed.common.network.api;

import com.aed.common.network.module.MessageBean;
import com.aed.common.network.module.PublishMyActivitiesBean;
import com.aed.common.network.module.PublishTagListBean;
import com.aed.common.network.module.TokeanBean;
import com.aed.common.network.module.UserPublishInfoBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by bamboo on 2018/8/16.
 */
public interface PublishApi {
    /**
     * 发布信息
     */
    @POST("/v1/activity/add")
    Observable<MessageBean> pubishInfo(@Body RequestBody body);
    /**
     * 获取标签：热门
     * @return
     */
    @GET("v1/tag/hottest")
    Observable<PublishTagListBean> getHottestTag();
    /**
     * 获取标签：最近
     * @return
     */
    @GET("/v1/tag/latest")
    Observable<PublishTagListBean> getLatestTag();
    /**
     * 获取我的活动
     * @return
     */
    @GET("/v1/activity/mine/apply")
    Observable<PublishMyActivitiesBean> getMyActivity(@QueryMap Map<String,String> map);

    /**
     * 视频的播放token
     * @return
     */
    @GET("/v1/video/token")
    Observable<TokeanBean> getToken(@QueryMap Map<String,String> map);
}
