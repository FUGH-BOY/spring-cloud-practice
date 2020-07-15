package com.fgh.service.impl;

import com.fgh.entity.Order;
import com.fgh.mapper.OrderMapper;
import com.fgh.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<Order> findOrderList(Order order) {
        return orderMapper.findOrderList(order);
    }
}
