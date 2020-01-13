package com.fh.model;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_pro")
public class Product {
    private Integer id;
    private String proName;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
