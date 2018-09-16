package com.aed.common.network.api;


import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by sk on 2018/7/10.
 */

public interface StoreApi {
//    /**
//     * 商品列表
//     * @return
//     */
//    @GET("v1/product/filter")
//    Observable<StoreBean> getStoreList(@QueryMap Map<String,String> map);
//    /**
//     * 购物车列表
//     * @return
//     */
//    @GET("v1/cart/info")
//    Observable<StoreCartListBean> getStoreCartList();
//    /**
//     * 推荐列表
//     * @return
//     */
//    @GET("v1/product/recommend")
//    Observable<RecommendBean> getRecommentList(@QueryMap Map<String,String> map);
//    /**
//     * 购物车数量改变
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/cart/increase")
//    Observable<StoreCartListBean> commodityChangeNum(@FieldMap Map<String,String> map);
//    /**
//     * 选择
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/cart/select")
//    Observable<StoreCartListBean> select(@FieldMap Map<String,String> map);
//    /**
//     * 选择全部
//     * @return
//     */
//    @POST("v1/cart/select-all")
//    Observable<StoreCartListBean> selectAll();
//    /**
//     * 取消
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/cart/un-select")
//    Observable<StoreCartListBean> cancle(@FieldMap Map<String,String> map);
//    /**
//     * 取消全部
//     * @return
//     */
//    @POST("v1/cart/un-select-all")
//    Observable<StoreCartListBean> cancleAll();
//    /**
//     * 删除
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/cart/remove")
//    Observable<StoreCartListBean> delete(@FieldMap Map<String,String> map);
//
//    /**
//     * 商品详情
//     * @return
//     */
//    @GET("v1/product/detail")
//    Observable<CommodityDetailBean> getCommodityDetail(@QueryMap Map<String,String> map);
//    /**
//     * 加入购物车
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/cart/add")
//    Observable<AddStoreCartBean> addToStoreCart(@FieldMap Map<String,String> map);
//    /**
//     * 获取优惠券
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/profile/coupon/receive")
//    Observable<CouponsBean> getCoupons(@FieldMap Map<String,String> map);
//
//    /**
//     * 获取地址列表
//     * @return
//     */
//    @GET("v1/profile/contacts")
//    Observable<LocationListBean> getLocation();
//    /**
//     * 保存地址
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/profile/contact/add")
//    Observable<LocationBean> saveLocation(@FieldMap Map<String,String> map);
//    /**
//     * 修改地址
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/profile/contact/update")
//    Observable<LocationBean> updateLocation(@FieldMap Map<String,String> map);
//    /**
//     * 下单
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/order/place")
//    Observable<PlaceOrderBean> placeOrder(@FieldMap Map<String,String> map);
//    /**
//     * 取消订单
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/order/cancel")
//    Observable<PlaceOrderBean> cancleOrder(@FieldMap Map<String,String> map);
//    /**
//     * 取消订单
//     * @return
//     */
//    @GET("v1/profile/info")
//    Observable<InfoBean> getNiLongProperty();
//    /**
//     * 预支付
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/payment/prepay")
//    Observable<AdvancePayAliBean> advancePay(@FieldMap Map<String,String> map);
//    /**
//     * 预支付wx
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/payment/prepay")
//    Observable<AdvancePayWxBean> advancePaywx(@FieldMap Map<String,String> map);
//
//    /**
//     * 订单列表
//     * @return
//     */
//    @GET("v1/order/list")
//    Observable<OrderListBean> getOrderList(@QueryMap Map<String,String> map);
//    /**
//     * 订单详情
//     * @return
//     */
//    @GET("v1/order/detail")
//    Observable<OrderDetailBean> getOrderDetail(@QueryMap Map<String,String> map);
//    /**
//     * 优惠券列表
//     * @return
//     */
//    @GET("v1/profile/coupons")
//    Observable<CouponsListBean> getCouponsList(@QueryMap Map<String,String> map);
//    /**
//     * 兑换优惠券
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("v1/profile/coupon/exchange")
//    Observable<CouponsItemBean> getCouponsByCode(@FieldMap Map<String,String> map);
//    /**
//     * 获取订单中的红点数目
//     * @return
//     */
//    @GET("v1/profile/info")
//    Observable<OrderInfoBean> getOrderInfo();
}
