package com.aed.common.tools;

import android.util.Log;

import com.aed.common.BuildConfig;


/**
 * Created by sk on 2018/6/5.
 */

public class LogUtils {

    public static void d(String TAG, String war) {
        if(!BuildConfig.ONLINE){
            Log.d(TAG,war);
        }
    }
    public static void e(String TAG, String war) {
        if(!BuildConfig.ONLINE){
            Log.e(TAG,war);
        }

    }
    public static void w(String TAG, String war) {
        if(!BuildConfig.ONLINE){
            Log.w(TAG,war);
        }

    }
}
