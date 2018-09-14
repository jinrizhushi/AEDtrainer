package com.aed.common.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Sendtion on 2016/10/24 0024 15:53
 * 邮箱：sendtion@163.com
 * 博客：http://sendtion.cn
 * 描述：笔记处理
 */

public class UserDao {
    private MyOpenHelper helper;

    public UserDao(Context context) {
        helper = new MyOpenHelper(context);
    }

    /**
     * 查询所有
     */
    public List<User> queryUserAll() {
        SQLiteDatabase db = helper.getWritableDatabase();

        List<User> UserList = new ArrayList<>();
        User user ;
        String sql ;
        Cursor cursor = null;
        try {
            sql = "select * from db_user " ;
            cursor = db.rawQuery(sql, null);
            //cursor = db.query("User", null, null, null, null, null, "n_id desc");
            while (cursor.moveToNext()) {
                //循环获得展品信息
                user = new User();
                user.setToken(cursor.getString(cursor.getColumnIndex("n_token")));
                user.setName(cursor.getString(cursor.getColumnIndex("n_name")));
                user.setImage(cursor.getString(cursor.getColumnIndex("n_image")));
                user.setIsClub(cursor.getInt(cursor.getColumnIndex("n_club")));
                user.setIsCeritivy(cursor.getInt(cursor.getColumnIndex("n_cerfy")));
                UserList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return UserList;
    }

    /**
     * 插入
     */
    public long insertUser(User user) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String sql = "insert into db_user(n_token,n_name,n_image,n_club,n_cerfy) " +
                "values(?,?,?,?,?)";

        long ret = 0;
        //sql = "insert into ex_user(eu_login_name,eu_create_time,eu_update_time) values(?,?,?)";
        SQLiteStatement stat = db.compileStatement(sql);
        db.beginTransaction();
        try {
            stat.bindString(1, user.getToken());
            stat.bindString(2, user.getName());
            stat.bindString(3, user.getImage());
            stat.bindLong(4,user.getIsClub());
            stat.bindLong(5, user.getIsCeritivy());
            ret = stat.executeInsert();
            db.setTransactionSuccessful();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
            db.close();
        }
        return ret;
    }

    /**
     * 更新笔记
     */
    public void updateUser(User user) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("n_token", user.getToken());
        values.put("n_name", user.getName());
        values.put("n_image", user.getImage());
        values.put("n_club", user.getIsClub());
        values.put("n_cerfy", user.getIsCeritivy());
        db.update("db_user", values, "n_token=?", new String[]{user.getToken()+""});
        db.close();
    }

    /**
     * 删除
     */
    public int deleteUser(String token) {
        SQLiteDatabase db = helper.getWritableDatabase();
        int ret = 0;
        try {
            ret = db.delete("db_user", "n_token=?", new String[]{token});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

}
