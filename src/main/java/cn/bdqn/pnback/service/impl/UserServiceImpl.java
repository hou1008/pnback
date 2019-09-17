package cn.bdqn.pnback.service.impl;


import cn.bdqn.pnback.dao.UserDao;
import cn.bdqn.pnback.pojo.User;
import cn.bdqn.pnback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public int updateFreeze(User user) {
        return userDao.updateFreeze(user);
    }

    @Override
    public List<User> getAllguan() {
        return userDao.getAllguan();
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public int updateGuan(User user) {
        return userDao.updateGuan(user);
    }

}
