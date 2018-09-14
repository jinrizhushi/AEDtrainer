package com.aed.common.tools;

import android.content.Context;
import android.text.TextUtils;

import com.aed.common.db.User;
import com.aed.common.db.UserDao;
import com.aed.common.network.common.Commons;
import com.aed.common.network.module.LoginBean;

import java.util.List;

public class UserInfoManager {
    private Context context;
    public void init(Context context) {
        this.context = context;
    }


    private static class SingletonHolder {
        public static UserInfoManager instance = new UserInfoManager();
    }

    private UserInfoManager(){}

    public static UserInfoManager newInstance() {
        return SingletonHolder.instance;
    }

    public boolean isLogin() {
        String userStr = LocalPreferenceHelper.getString(context, Commons.USER_INFO_TOKEN);
        if (TextUtils.isEmpty(userStr)) {
            return false;
        }
        return true;
    }
    public void saveUser(User user) {
        // 保存到本地
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_TOKEN, user.getToken());
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_NAME, user.getName());
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_IMAGE, user.getImage());
        if(user.getIsClub()==0){
            LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CLUB, false);
        }else {
            LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CLUB, true);
        }
        if(user.getIsCeritivy()==0){
            LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CERTIFICATED, false);
        }else {
            LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CERTIFICATED, true);
        }

    }

    public void saveUserInfo(LoginBean.DataBean userInfo) {
        // 保存到本地
        String uid = userInfo.getToken().substring(0,userInfo.getToken().indexOf("."));
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_TOKEN, uid);
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_NAME, userInfo.getName());
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_IMAGE, userInfo.getImage());
        LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CLUB, userInfo.isClub());
        LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CERTIFICATED, userInfo.isCertificated());
        //保存到数据库

        User user = new User();
        user.setToken(uid);
        user.setName(userInfo.getName());
        user.setImage(userInfo.getImage());
        if(userInfo.isClub()){
            user.setIsClub(1);
        }else {
            user.setIsClub(0);
        }
        if(userInfo.isCertificated()){
            user.setIsCeritivy(1);
        }else {
            user.setIsCeritivy(0);
        }
        UserDao userDao = new UserDao(context);
        List<User> users = userDao.queryUserAll();
        boolean hassave =false;
        for (int i=0;i<users.size();i++){
            if(TextUtils.equals(users.get(i).getToken(),uid)){
                hassave=true;
            }
        }
        if(hassave){
            userDao.updateUser(user);
        }else {
            userDao.insertUser(user);
        }
        if(users.size()>10){
            userDao.deleteUser(users.get(0).getToken());
        }
    }

    public String getUID() {
        String uid =LocalPreferenceHelper.getString(context, Commons.USER_INFO_TOKEN);
        return uid;
    }
    public String getPhoto() {
        return LocalPreferenceHelper.getString(context, Commons.USER_INFO_IMAGE);
    }
    public String getUserName() {
        String name =LocalPreferenceHelper.getString(context, Commons.USER_INFO_NAME);
        if(!TextUtils.isEmpty(name)){
            return name;
        }else {
            return "";
        }
    }

    /**
     * 是否是俱乐部
     * @return
     */
    public boolean isClub() {
        return LocalPreferenceHelper.getBoolean(context, Commons.USER_INFO_CLUB);
    }

    /**
     * 是否认证过
     * @return
     */
    public boolean isCertificated() {
        return LocalPreferenceHelper.getBoolean(context, Commons.USER_INFO_CERTIFICATED);
    }

    public void logout() {
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_TOKEN, "");
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_NAME, "");
        LocalPreferenceHelper.putString(context, Commons.USER_INFO_IMAGE, "");
        LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CLUB, false);
        LocalPreferenceHelper.putBoolean(context, Commons.USER_INFO_CERTIFICATED, false);
    }
}
