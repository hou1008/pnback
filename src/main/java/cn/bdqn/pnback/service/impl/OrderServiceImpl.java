package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.OrderDao;
import cn.bdqn.pnback.pojo.Order;
import cn.bdqn.pnback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    public OrderDao orderDao;


    //查找所有订单
    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }

    //实时更新所有订单状态
    @Override
    public List<Order> getAllgeng() {
        return orderDao.getAllgeng();
    }


    //修改订单状态
    @Override
    public Integer updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }
}
