package com.bugu.content.entity;

import java.io.Serializable;

/**
 * Created by zhoumingtian on 2018-06-26
 * 内容赞
 */
public class ConentStar implements Serializable{

    private Long id; //主键Id

    private Long uId; //点赞用户

    private Long cId; //点赞内容

    private int status; //点赞状态 0未赞, 1已赞

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
