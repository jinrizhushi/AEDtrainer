package com.aed.common.network;

/**
 * Created by sk on 2018/7/10.
 */

public interface Response<T> {
     void success(T t);
     void fail(String s);
     void complete();
}
