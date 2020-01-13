package com.fh.service;

import com.fh.action.YH.ServletRequest;
import com.fh.model.Order;
import com.fh.model.ProQuery;
import com.fh.model.Product;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    ServletRequest queryOrderList(ProQuery proQuery);

    void delOrderId(Order order);

    Order queryOrderById(Integer id);

    void updateOrder(Order order);

    List<Product> queryProduct();

    ServletRequest queryprice(Integer id);
}
