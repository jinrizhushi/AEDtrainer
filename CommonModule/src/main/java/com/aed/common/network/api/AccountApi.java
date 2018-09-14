package com.aed.common.network.api;


import com.aed.common.network.module.AccountBean;
import com.aed.common.network.module.AuditListBean;
import com.aed.common.network.module.ClubBaseBean;
import com.aed.common.network.module.ClubBean;
import com.aed.common.network.module.MessageBean;
import com.aed.common.network.module.TaskBean;
import com.aed.common.network.module.TeamTypeBean;
import com.aed.common.network.module.TokenBean;
import com.aed.common.network.module.VerifyPersonalBean;
import com.aed.common.network.module.LoginBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface AccountApi {
    /**
     * 个人信息验证
     */
    @FormUrlEncoded
    @POST("v1/profile/certificate")
    Observable<VerifyPersonalBean> certificate(@FieldMap Map<String, String> map);
    /**
     * 社团信息验证
     */
    @FormUrlEncoded
    @POST("v1/club/certificate")
    Observable<VerifyPersonalBean> certificateClub(@FieldMap Map<String, String> map);
    /**
     * 个人信息验证
     */
    @GET("v1/image/secret/token")
    Observable<TokenBean> getToken(@QueryMap Map<String, String> map);
    /**
     * 头像上传的token
     */
    @GET("v1/image/token")
    Observable<TokenBean> getTokenPhoto(@QueryMap Map<String, String> map);

    /**
     * 手机号登录
     */
    @FormUrlEncoded
    @POST("v1/login/vcode")
    Observable<LoginBean> phoneLogin(@FieldMap Map<String, String> map);

    /**
     * 微信登录
     */
    @FormUrlEncoded
    @POST("v1/login/wechat")
    Observable<LoginBean> weChatLogin(@FieldMap Map<String, String> map);

    /**
     * 获取短信验证码
     */
    @GET("v1/login/vcode")
    Observable<MessageBean> getVCode(@QueryMap Map<String, String> map);
    /**
     * 社团登录
     */
    @FormUrlEncoded
    @POST("v1/login/club")
    Observable<LoginBean> teamLogin(@FieldMap Map<String, String> map);
    /**
     * 社团类型
     */
    @GET("v1/club/disk/category")
    Observable<TeamTypeBean> teamType();
    /**
     * 社团注册
     */
    @FormUrlEncoded
    @POST("v1/login/club/register")
    Observable<LoginBean> teamregist(@FieldMap Map<String, String> map);
    /**
     * 密碼找回
     */
    @FormUrlEncoded
    @POST("v1/login/club/password/forgot")
    Observable<MessageBean> findPassword(@FieldMap Map<String, String> map);


    /**
     * 我的页面基本信息
     */
    @GET("v1/profile/info")
    Observable<AccountBean> accountInfo();
    /**
     * 邀请码
     */
    @GET("v1/invite/code")
    Observable<MessageBean> getInviteCode();
    /**
     * 操作接收开关
     */
    @FormUrlEncoded
    @POST("v1/profile/set/receive_un_followed_pm")
    Observable<MessageBean> switchMessage(@FieldMap Map<String, String> map);
    /**
     * 修改密码(暂不支持)
     */
    @FormUrlEncoded
    @POST("admin/password/modify")
    Observable<MessageBean> changePwd(@FieldMap Map<String, String> map);
    /**
     * 社团信息
     */
    @GET("v1/club/info")
    Observable<ClubBean> getClubInfo(@QueryMap Map<String, String> map);
    /**
     * 社团基本信息
     */
    @GET("v1/club/invite/detail")
    Observable<ClubBaseBean> getClubBaseInfo(@QueryMap Map<String, String> map);
    /**
     * 修改社团信息
     */
    @POST("v1/club/update/invite/detail")
    Observable<MessageBean> changeTeamBaseInfo(@Body RequestBody body);
    /**
     * 修改社团单个信息
     */
    @FormUrlEncoded
    @POST("v1/profile/update")
    Observable<AccountBean> changeTeamInfo(@FieldMap Map<String, String> map);
    /**
     * 社团和个人的:任务列表
     */
    @GET("v1/task/list")
    Observable<TaskBean> getTashInfo(@QueryMap Map<String, String> map);
    /**
     *审核列表
     */
    @GET("v1/club/member/join/audit")
    Observable<AuditListBean> getAuditList(@QueryMap Map<String, String> map);
    /**
     *接收加入
     */
    @FormUrlEncoded
    @POST("v1/club/member/join/accept")
    Observable<MessageBean> accept(@FieldMap Map<String, String> map);
    /**
     *拒绝加入
     */
    @FormUrlEncoded
    @POST("v1/club/member/join/reject")
    Observable<MessageBean> refuse(@FieldMap Map<String, String> map);
}
