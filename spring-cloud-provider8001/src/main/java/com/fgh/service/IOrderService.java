package com.fgh.service;

import com.fgh.entity.Order;

import java.util.List;

public interface IOrderService {

    public List<Order> findOrderList(Order order);

}
