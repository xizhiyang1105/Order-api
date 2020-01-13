package com.fh.action;

import com.alibaba.fastjson.JSONArray;
import com.fh.action.YH.ServletRequest;
import com.fh.model.Order;
import com.fh.model.ProQuery;
import com.fh.model.Product;
import com.fh.service.OrderService;
import com.fh.uitl.RedisPools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("order")
@CrossOrigin
public class OrderAction {
    @Autowired
    private OrderService orderService;

    @RequestMapping("queryProduct")
    @ResponseBody
    public ServletRequest queryProduct(){
        List<Product> list= orderService.queryProduct();
        return ServletRequest.success(list);
    }

    @RequestMapping("addOrder")
    @ResponseBody
    public ServletRequest addOrder(Order order){
        orderService.addOrder(order);
        return ServletRequest.success();
    }

    @RequestMapping("queryOrderList")
    @ResponseBody
    public ServletRequest queryOrderList(ProQuery proQuery){
        return orderService.queryOrderList(proQuery);
    }
    //删除
    @RequestMapping("delOrderId")
    @ResponseBody
    public  ServletRequest delOrderId(Order order){
        orderService.delOrderId(order);
        return ServletRequest.success() ;
    }

    //回显
    @RequestMapping("queryOrderById")
    @ResponseBody
    public ServletRequest queryOrderById(Integer id){
        Order list=orderService.queryOrderById(id);
        return ServletRequest.success(list);
    }

    //修改
    @RequestMapping("updateOrder")
    @ResponseBody
    public ServletRequest updateOrder(Order order){
        orderService.updateOrder(order);
        return ServletRequest.success();
    }

    @RequestMapping("queryprice")
    @ResponseBody
    public ServletRequest queryprice(Integer id){
        return orderService.queryprice(id);
    }

}
