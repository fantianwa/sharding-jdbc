package com.sharding.jdbc.shardingjdbc.service.impl;

import com.sharding.jdbc.shardingjdbc.entity.Order;
import com.sharding.jdbc.shardingjdbc.mapper.OrderMapper;
import com.sharding.jdbc.shardingjdbc.service.OrderService;
import com.sharding.jdbc.shardingjdbc.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public void createOrder(Order order) {
        order.setOrderId(UUIDUtil.getUUID());
        orderMapper.insert(order);
    }
}
