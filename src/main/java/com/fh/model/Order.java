package com.fh.model;

import com.baomidou.mybatisplus.annotation.TableField;

public class Order {
    private Integer id;
    private Integer proID;
    private double price;
    private Integer shu;
    private double xiaoji;
    @TableField(exist = false)
    private String proName;
    private Integer del;

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProID() {
        return proID;
    }

    public void setProID(Integer proID) {
        this.proID = proID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getShu() {
        return shu;
    }

    public void setShu(Integer shu) {
        this.shu = shu;
    }

    public double getXiaoji() {
        return xiaoji;
    }

    public void setXiaoji(double xiaoji) {
        this.xiaoji = xiaoji;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }
}
