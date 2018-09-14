package com.aed.common.network;

import android.content.Context;

import com.aed.common.BuildConfig;
import com.aed.common.network.api.AccountApi;
import com.aed.common.network.api.ClubApi;
import com.aed.common.network.api.FeedApi;
import com.aed.common.network.api.PublishApi;
import com.aed.common.network.api.StoreApi;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sk on 2018/7/10.
 */

public class HttpUtil<T> {
    public static Context context;
    public static String baseUrl = BuildConfig.BASE_URL;

    private static class LazyHolder {
        private static final HttpUtil INSTANCE = new HttpUtil();
    }
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new TokenInterceptor()).build();
    private static TokenInterceptor2 tokenInterceptor = new TokenInterceptor2();
    private static OkHttpClient okHttpClient2 = new OkHttpClient.Builder().addInterceptor(tokenInterceptor).build();
    private static Converter.Factory gsonConverterFactory = GsonConverterFactory.create();
    private static CallAdapter.Factory rxJavaCallAdapterFactory = RxJava2CallAdapterFactory.create();
    private static StoreApi storeApi;
    private static AccountApi accountApi;
    private static AccountApi accountApi2;
    private static FeedApi feedApi;
    private static PublishApi publishApi;
    private static ClubApi clubApi;
    private HttpUtil(){}

    public static HttpUtil getInstance(){
        return LazyHolder.INSTANCE;
    }
    public Disposable getDisPosable(Observable observable, final Response<T> response) {
        return  observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<T>() {
                    @Override
                    public void accept(T t) throws Exception {
                        //这里接收数据项
                        response.success(t);
                        response.complete();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        //这里接收onError
                        response.fail(throwable.toString());
                        response.complete();
                    }
                });
    }
    /**
     * s商城接口
     * @return
     */
    public StoreApi getstoreApi() {
        if (storeApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            storeApi = retrofit.create(StoreApi.class);
        }
        return storeApi;
    }
    /**
     * 账户接口
     * @return
     */
    public AccountApi getAccountApi() {
        if (accountApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            accountApi = retrofit.create(AccountApi.class);
        }
        return accountApi;
    }
    /**
     * 账户接口
     * @return
     * @param userId
     */
    public AccountApi getAccountApi2(String userId) {
        tokenInterceptor.setUserId(userId);
        if (accountApi2 == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient2)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            accountApi2 = retrofit.create(AccountApi.class);
        }
        return accountApi2;
    }
    /**
     * feed接口
     * @return
     */
    public FeedApi getFeedApi() {
        if (feedApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            feedApi = retrofit.create(FeedApi.class);
        }
        return feedApi;
    }
    /**
     * feed接口
     * @return
     */
    public PublishApi getPublishApi() {
        if (publishApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            publishApi = retrofit.create(PublishApi.class);
        }
        return publishApi;
    }
    /**
     * 社团接口
     * @return
     */
    public ClubApi getClubApi() {
        if (clubApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            clubApi = retrofit.create(ClubApi.class);
        }
        return clubApi;
    }
}
