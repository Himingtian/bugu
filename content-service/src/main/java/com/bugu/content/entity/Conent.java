package com.bugu.content.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by zhoumingtian on 2018-06-26
 * 内容
 */
public class Conent implements Serializable{

    private Long id; //主键Id

    private String titleName; //标题

    private Long categoryId; //分类Id

    private Long star; //点赞数量

    private Long view; //浏览量

    private int status; //当前用户点赞状态

    private BigDecimal bounty; //获得赏金

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getStar() {
        return star;
    }

    public void setStar(Long star) {
        this.star = star;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getBounty() {
        return bounty;
    }

    public void setBounty(BigDecimal bounty) {
        this.bounty = bounty;
    }
}
