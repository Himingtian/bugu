package com.bugu.content.entity;

import java.io.Serializable;

/**
 * Created by zhoumingtian on 2018-06-26
 * 内容详情
 */
public class ConentDetail implements Serializable{

    private Long id; // 主键Id

    private Long conentId; //内容Id

    private String src; //内容详情保存路径

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConentId() {
        return conentId;
    }

    public void setConentId(Long conentId) {
        this.conentId = conentId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
