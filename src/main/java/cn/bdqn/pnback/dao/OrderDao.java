package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    //查找订单状态
    List<Order> getAll();

    //定时更新订单状态

    List<Order> getAllgeng();

    //修改订单状态
    Integer updateOrder(@Param("Order") Order order);
}
