package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    int zeng(Menu menu);
    List<Menu> lala(@Param("pid") int pid);
    List<Menu> lala1(@Param("pid") int pid);
    List<Menu> lala2(@Param("pid") int pid);
}
