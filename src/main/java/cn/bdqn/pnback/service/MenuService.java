package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {

    List<Menu> lala(@Param("pid") int pid);
    List<Menu> lala1(@Param("pid") int pid);
    List<Menu> lala2(@Param("pid") int pid);
}
