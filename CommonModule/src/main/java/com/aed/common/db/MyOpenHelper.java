package com.aed.common.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 作者：Sendtion on 2016/10/24 0024 15:14
 * 邮箱：sendtion@163.com
 * 博客：http://sendtion.cn
 * 描述：数据库帮助类
 */

public class MyOpenHelper extends SQLiteOpenHelper {

    private final static String DB_NAME = "user.db";// 数据库文件名
    private final static int DB_VERSION = 1;// 数据库版本

    public MyOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建笔记表
        db.execSQL("create table db_user(n_id integer primary key autoincrement, n_token varchar,n_name varchar, " +
                "n_image varchar, n_club integer,n_cerfy integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
