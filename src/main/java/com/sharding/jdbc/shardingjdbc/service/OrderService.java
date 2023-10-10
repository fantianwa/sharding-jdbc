package com.sharding.jdbc.shardingjdbc.service;

import com.sharding.jdbc.shardingjdbc.entity.Order;

import java.util.List;

public interface OrderService {

    void createOrder(Order order);

    List<Order> queryOrder();
}
