package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    //查找订单
    List<Order> getAll();

    //定时更新订单状态

    List<Order> getAllgeng();

    //修改订单状态
    Integer updateOrder(@Param("Order") Order order);
}
