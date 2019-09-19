package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    /**
     * 获取总条目数
     */
    int getCount();
    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Order> getorder(@Param("index") int index, @Param("pageCount") int pageCount);


    List<Order> getsou(@Param("oBianhao") int oBianhao);



    //定时更新订单状态

    List<Order> getAllgeng();

    //修改订单状态
    Integer updateOrder(@Param("Order") Order order);
}
