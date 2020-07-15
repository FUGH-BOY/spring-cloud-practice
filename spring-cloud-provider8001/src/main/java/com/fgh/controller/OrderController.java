package com.fgh.controller;

import com.fgh.controller.base.BaseController;
import com.fgh.entity.Order;
import com.fgh.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class OrderController extends BaseController {

    @Resource
    private IOrderService orderService;

    @GetMapping(value = "/order/list")
    public List<Order> findOrderList(Order order) {
        return orderService.findOrderList(order);
    }


}
