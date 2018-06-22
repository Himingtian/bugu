package com.bugu.user.entity;

import java.io.Serializable;

/**
 * Created by zhoumingtian on 2018-06-22
 */
public class User implements Serializable {

    private String userName;

    private String password;

    private Integer number;  //手机号

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
