package cn.bdqn.pnback.service;


import cn.bdqn.pnback.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface UserService {
    //查找全部User数据
    List<User> getAll();
    //更改用户冻结状态
    int updateFreeze(User user);
    //查找管理员
    List<User> getAllguan();
    //修改管理员信息
    int updateGuan(User user);
}
