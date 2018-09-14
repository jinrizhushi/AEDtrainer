package com.aed.common.db;

import java.io.Serializable;


public class User implements Serializable {

   private String token;
   private String name;
   private String image;
   private int isClub;
   private int isCeritivy;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIsClub() {
        return isClub;
    }

    public void setIsClub(int isClub) {
        this.isClub = isClub;
    }

    public int getIsCeritivy() {
        return isCeritivy;
    }

    public void setIsCeritivy(int isCeritivy) {
        this.isCeritivy = isCeritivy;
    }
}
