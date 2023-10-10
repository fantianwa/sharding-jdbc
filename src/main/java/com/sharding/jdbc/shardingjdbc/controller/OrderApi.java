package com.sharding.jdbc.shardingjdbc.controller;

import com.sharding.jdbc.shardingjdbc.entity.Order;
import com.sharding.jdbc.shardingjdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderApi {

    @Autowired
    private OrderService orderService;

    @GetMapping("/index")
    public String index() {
        return "success";
    }

    @PostMapping("/createOrder")
    public void createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
    }

    @GetMapping("/queryOrder")
    public List<Order> queryOrder() {
        return orderService.queryOrder();
    }
}
