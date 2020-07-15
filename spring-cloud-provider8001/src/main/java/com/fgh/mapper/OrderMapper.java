package com.fgh.mapper;

import com.fgh.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    public List<Order> findOrderList(Order order);


}
