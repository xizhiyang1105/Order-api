package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Order;
import com.fh.model.ProQuery;
import com.fh.model.Product;

import java.util.List;

public interface OrderDao extends BaseMapper<Order> {

    void delOrderId(Order order);

    Integer queryCount(ProQuery proQuery);

    List queryList(ProQuery proQuery);

    List<Product> queryProduct();
}
