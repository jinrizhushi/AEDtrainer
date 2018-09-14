package com.aed.common.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.util.ArrayMap;
import android.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.List;
import java.util.Map;

public class LocalPreferenceHelper {
    // 缓存String格式
    private static Map<String, String> sharedData = new ArrayMap<>();

    public synchronized static SharedPreferences getInstance(Context context) {
        if (context != null) {
            // 以包名为名
            return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        }
        return null;
    }

    public synchronized static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean(key, value);
            editor.apply();
        }
    }

    public synchronized static void putInt(Context context, String key, int value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(key, value);
            editor.apply();
        }
    }

    public synchronized static void putLong(Context context, String key, long value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putLong(key, value);
            editor.apply();
        }
    }

    public synchronized static void putString(Context context, String key, String value) {
        SharedPreferences sp = getInstance(context);
        sharedData.put(key, value);
        if (sp != null) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(key, value);
            editor.apply();
        }
    }

    public synchronized static String getString(Context context, String key) {
        return getString(context, key, "");
    }

    public synchronized static String getString(Context context, String key, String value) {
        SharedPreferences sp = getInstance(context);
        if (sharedData.containsKey(key)) {
            return sharedData.get(key);
        }

        if (sp != null) {
            return sp.getString(key, value);
        }

        return value;
    }

    public synchronized static long getInt(Context context, String key, int value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            return sp.getInt(key, value);
        }

        return 0;
    }

    public synchronized static long getLong(Context context, String key, long value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            return sp.getLong(key, value);
        }

        return 0;
    }

    public synchronized static boolean getBoolean(Context context, String key) {
        return getBoolean(context, key, false);
    }

    public synchronized static boolean getBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            return sp.getBoolean(key, value);
        }

        return false;
    }

    public synchronized static void putFloat(Context context, String key, float value) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putFloat(key, value);
            editor.apply();
        }
    }

    public synchronized static void remove(Context context, String key) {
        SharedPreferences sp = getInstance(context);
        if (sp != null) {
            SharedPreferences.Editor editor = sp.edit();
            editor.remove(key);
            editor.apply();

            if (sharedData.containsKey(key)) {
                sharedData.remove(key);
            }
        }
    }

    public synchronized static boolean contains(Context context, String key) {
        SharedPreferences sp = getInstance(context);
        return sp != null && sp.contains(key);
    }
    public static String listToString(List<?> list)throws IOException {
        // 实例化一个ByteArrayOutputStream对象，用来装载压缩后的字节文件。
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // 然后将得到的字符数据装载到ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                byteArrayOutputStream);
        // writeObject 方法负责写入特定类的对象的状态，以便相应的 readObject 方法可以还原它
        objectOutputStream.writeObject(list);
        // 最后，用Base64.encode将字节文件转换成Base64编码保存在String中
        String listString = new String(Base64.encode(
                byteArrayOutputStream.toByteArray(), Base64.DEFAULT));
        // 关闭objectOutputStream
        objectOutputStream.close();
        return listString;
    }

    @SuppressWarnings("unchecked")
    public static List<?> StringToList(String listString) throws StreamCorruptedException, IOException,
            ClassNotFoundException {
        byte[] mobileBytes = Base64.decode(listString.getBytes(),
                Base64.DEFAULT);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
                mobileBytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(
                byteArrayInputStream);
        List<?> WeatherList = (List<?>) objectInputStream
                .readObject();
        objectInputStream.close();
        return WeatherList;
    }

}
