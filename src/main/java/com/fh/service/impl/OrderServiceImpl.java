package com.fh.service.impl;

import com.fh.action.YH.ServletRequest;
import com.fh.dao.OrderDao;
import com.fh.dao.ProductDao;
import com.fh.model.Order;
import com.fh.model.ProQuery;
import com.fh.model.Product;
import com.fh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;

    @Override
    public void addOrder(Order order) {
        orderDao.insert(order);
    }

    @Override
    public ServletRequest queryOrderList(ProQuery proQuery) {
        Map map=new HashMap();
        Integer count=orderDao.queryCount(proQuery);
        List drugList=orderDao.queryList(proQuery);
        map.put("draw",proQuery.getDraw());
        map.put("recordsTotal",count);
        map.put("recordsFiltered",count);
        map.put("data",drugList);
        return ServletRequest.success(map);
    }

    @Override
    public void delOrderId(Order order) {
        orderDao.delOrderId(order);
    }

    @Override
    public Order queryOrderById(Integer id) {
        return orderDao.selectById(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderDao.updateById(order);
    }

    @Override
    public List<Product> queryProduct() {
        return orderDao.queryProduct();
    }

    @Override
    public ServletRequest queryprice(Integer id) {
        Product product = productDao.selectById(id);
        return ServletRequest.success(product);
    }
}
