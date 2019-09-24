package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {

    List<Menu> lala(@Param("pid") int pid);
    List<Menu> lala1(@Param("pid") int pid);
    List<Menu> lala2(@Param("pid") int pid);
    /**
     * 获取总条目数
     */
    int getCount();
    /**
     * 获取商品信息通过page,从第一个开始，每页显示几条数据
     */
    List<Menu> getConsultsPage(@Param("index") int index, @Param("pageCount") int pageCount);
    Integer add(Menu menu);
    Menu getId(Integer id);
    Integer update(Menu menu);
    Integer del(Integer id);
}
