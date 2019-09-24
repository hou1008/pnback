package cn.bdqn.pnback.dao;


import cn.bdqn.pnback.pojo.Consults;
import cn.bdqn.pnback.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsultsDao {
    int add(Consults consults);

    //id查
    Consults getConsults(Integer id);

    Integer update(Consults consults);

    int del(Integer id);

    /**
     * 获取总条目数
     */
    int getCount();

    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Consults> getConsultsPage(@Param("index") int index, @Param("pageCount") int pageCount);

    List<Consults> getMohu(String zxName);
}
