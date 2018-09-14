package com.aed.common.tools;

import android.content.Context;
import android.os.Environment;

public class PathUtils {
    //外部路径
    private static  String sdRootPath = Environment.getExternalStorageDirectory().getPath()+"/aed";
    private static String appRootPath =  null;
    public static String getStorageDirectory(Context context){
        appRootPath = context.getCacheDir().getPath()+"/aed";
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) ?
                sdRootPath : appRootPath;
    }
}
