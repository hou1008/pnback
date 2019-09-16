package cn.bdqn.pnback.service;


import cn.bdqn.pnback.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {
    /**
     * 获取总条目数
     */
    int getCount();
    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Goods> getGoodsPage(@Param("index") int index, @Param("pageCount") int pageCount);
}

