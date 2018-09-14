package com.aed.common.network.api;

import com.aed.common.network.module.ClubListBean;
import com.aed.common.network.module.TokenBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ClubApi {
    /**
     * 推荐社团
     */
    @GET("v1/club/recommend")
    Observable<ClubListBean> getClubList(@QueryMap Map<String, String> map);
}
