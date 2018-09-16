package com.aed.common.network.api;




import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface FeedApi {
//    /**
//     * banner
//     */
//    @GET("v1/banner/list")
//    Observable<BannerData> getBanner(@QueryMap Map<String,String> map);
//    /**
//     * 按月份、本地、兴趣标签聚合活动
//     */
//    @GET("v1/tag/banner")
//    Observable<HotBean> getMonthData(@QueryMap Map<String,String> map);
//    /**
//     * 推荐feed
//     */
//    @GET("v1/feed/recommend")
//    Observable<FeedData> getRecommend(@QueryMap Map<String,String> map);
//    /**
//     * 精华feed
//     */
//    @GET("v1/club/feed/essence")
//    Observable<FeedData> getBestFeed(@QueryMap Map<String,String> map);
//    /**
//     * 个人动态
//     */
//    @GET("v1/profile/feed/timeline")
//    Observable<FeedData> getPersonFeed(@QueryMap Map<String,String> map);
//
//    /**
//     * 动态feed
//     */
//    @GET("v1/club/feed/timeline")
//    Observable<FeedData> getClubFeed(@QueryMap Map<String,String> map);
//    /**
//     * 关注feed列表
//     */
//    @GET("v1/feed/followed/more")
//    Observable<FeedData> getFocus(@QueryMap Map<String,String> map);
//    /**
//     * 按月份、本地、兴趣标签聚合活动
//     */
//    @GET("v1/feed/followed")
//    Observable<FeedData> refreshFocus(@QueryMap Map<String,String> map);
//
//    /**
//     * 标签：feed列表
//     */
//    @GET("v1/tag/feed")
//    Observable<FeedData> refreshTags(@QueryMap Map<String,String> map);
//    /**
//     * 标签：更多feed
//     */
//    @GET("v1/tag/feed/more")
//    Observable<FeedData> getTags(@QueryMap Map<String,String> map);
//    /**
//     * 文章详情
//     */
//    @GET("v1/feed/detail")
//    Observable<FeedArticleBean> getArticleDetail(@QueryMap Map<String,String> map);
//
//    /**
//     * 点赞列表
//     */
//    @GET("v1/fav/users")
//    Observable<PraiseBean> getPraiseList(@QueryMap Map<String,String> map);
//    /**
//     * 评论列表
//     */
//    @GET("v1/comment/list")
//    Observable<CommentBean> getCommentList(@QueryMap Map<String,String> map);
//    /**
//     * 报道列表
//     */
//    @GET("v1/activity/related/feed")
//    Observable<ReportBean> getReportList(@QueryMap Map<String,String> map);
//    /**
//     * 报道列表
//     */
//    @GET("v1/activity/related/feed")
//    Observable<FeedData> getReportList2(@QueryMap Map<String,String> map);
//    /**
//     * 发表评论
//     */
//    @FormUrlEncoded
//    @POST("v1/comment/add")
//    Observable<MessageBean> sendComment(@FieldMap Map<String, String> map);
//    /**
//     * 点赞
//     */
//    @FormUrlEncoded
//    @POST("v1/fav/confirm")
//    Observable<MessageBean> praise(@FieldMap Map<String, String> map);
//    /**
//     * 取消点赞
//     */
//    @FormUrlEncoded
//    @POST("v1/fav/cancel")
//    Observable<MessageBean> canclePraise(@FieldMap Map<String, String> map);
//    /**
//     * 关注
//     */
//    @FormUrlEncoded
//    @POST("v1/follow/confirm")
//    Observable<MessageBean> focus(@FieldMap Map<String, String> map);
//    /**
//     * 举报
//     */
//    @FormUrlEncoded
//    @POST("v1/feed/inform")
//    Observable<MessageBean> report(@FieldMap Map<String, String> map);
//    /**
//     * 屏蔽
//     */
//    @FormUrlEncoded
//    @POST("v1/feed/block")
//    Observable<MessageBean> pingbi(@FieldMap Map<String, String> map);
//    /**
//     * 活动报名
//     */
//    @FormUrlEncoded
//    @POST("/v1/activity/apply")
//    Observable<MessageBean> apply(@FieldMap Map<String, String> map);
//    /**
//     * 关注
//     */
//    @FormUrlEncoded
//    @POST("v1/profile/ban")
//    Observable<MessageBean> defriend(@FieldMap Map<String, String> map);
//    /**
//     * 点赞列表
//     */
//    @GET("v1/fav/users")
//    Observable<PraiseBean> praiseList(@QueryMap Map<String, String> map);
//    /**
//     * 参与活动列表
//     */
//    @GET("v1/activity/applicants")
//    Observable<JoinPersonBean> joinList(@QueryMap Map<String, String> map);
//    /**
//     * 获取视频地址
//     */
//    @GET("v1/video/detail")
//    Observable<VideoBean> videoUrl(@QueryMap Map<String, String> map);
//    /**
//     * 我参加的活动
//     */
//    @GET("v1/activity/mine/apply")
//    Observable<FeedData> getMyActivityList(@QueryMap Map<String, String> map);
//    /**
//     * 我发布的活动
//     */
//    @GET("v1/activity/mine/publish")
//    Observable<FeedData> getPublishList(@QueryMap Map<String, String> map);
//
//    /**
//     * feed上传照片
//     */
//    @GET("v1/image/token")
//    Observable<TokenBean> getToken(@QueryMap Map<String, String> map);
//    /**
//     * 邀请的个人用户信息
//     */
//    @GET("v1/invite/invited/users")
//    Observable<FriendsBean> getUncertifyFriends(@QueryMap Map<String, String> map);
//    /**
//     * 邀请的社团用户信息
//     */
//    @GET("v1/invite/invited/clubs")
//    Observable<FriendsBean> getUncertifyClubFriends(@QueryMap Map<String, String> map);
//    /**
//     * 删除发布
//     */
//    @FormUrlEncoded
//    @POST("v1/feed/remove")
//    Observable<MessageBean> delete(@FieldMap Map<String, String> map);
}

