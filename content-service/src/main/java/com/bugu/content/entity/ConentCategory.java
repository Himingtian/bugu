package com.bugu.content.entity;

import java.io.Serializable;

/**
 * Created by zhoumingtian on 2018-06-26
 * 内容分类
 */
public class ConentCategory implements Serializable{

    private Long id; //主键Id

    private String categoryName; //分类名称

    private Long parentId; //上级分类Id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
