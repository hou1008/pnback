package cn.bdqn.pnback.dao;


import cn.bdqn.pnback.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    int updateFreeze(@Param("user") User user);
    List<User> getAllguan();
    int updateGuan(@Param("user") User user);
}
