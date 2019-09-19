package cn.bdqn.pnback.service;


import cn.bdqn.pnback.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface UserService {
    //查找全部User数据
    List<User> getAll();
    //查找冻结用户
    List<User> getAlldong();
    //更改用户冻结状态
    int updateFreeze(Integer uid,Integer freeze);
    //查找管理员
    List<User> getAllguan();
    //修改管理员信息
    int updateGuan(Integer uid,String phone,String password,String nickname,String modifyDate,String autograph);
    //根据id查找
    User getAllid(Integer uid);
    //登录
    int pan(String phone,String password);
}
