package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {

    /**
     * 获取总条目数
     */
    int getCount();
    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Goods> getGoodsPage(@Param("index") int index,@Param("pageCount") int pageCount);
    /**
     * 删除
     */
    Integer del(@Param("gId") Integer gId);
    /**
     * 添加
     */
    Integer add(Goods goods);
    /**
     * 修改
     */
    Integer upd(Goods goods);
    /**
     * 根据id查
     */
    Goods getGoodsById(@Param("gId") Integer gId);
    /**
     * 模糊查
     */
    List<Goods> getGoodsByName(@Param("gName") String gName);
}
