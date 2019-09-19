package cn.bdqn.pnback.dao;


import cn.bdqn.pnback.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //查找所有用户
    List<User> getAll();
    //查找冻结用户
    List<User> getAlldong();
    //修改用户状态
    int updateFreeze(@Param("uid") Integer uid,@Param("freeze") Integer freeze);
    //查找管理员
    List<User> getAllguan();
    //修改管理员信息
    int updateGuan(@Param("uid") Integer uid,@Param("phone") String phone,@Param("password") String password,@Param("nickname") String nickname,@Param("modifyDate") String modifyDate,@Param("autograph") String autograph);


    int pan(@Param("phone") String phone,@Param("password") String password);


}
