package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Trouble;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TroubleDao {
    /**
     * 获取总条目数
     */
    int getCount();

    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Trouble> getConsultsPage(@Param("index") int index, @Param("pageCount") int pageCount);
    Integer add(Trouble trouble);

    Trouble getId(Integer id);
    Integer update(Trouble trouble);
    Integer del(Integer id);
    List<Trouble> getMohu(String name);
}
