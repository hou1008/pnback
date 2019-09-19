package cn.bdqn.pnback.service.impl;


import cn.bdqn.pnback.dao.UserDao;
import cn.bdqn.pnback.pojo.User;
import cn.bdqn.pnback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public List<User> getAlldong() {
        return userDao.getAlldong();
    }

    @Override
    public int updateFreeze(Integer uid,Integer freeze) {
        return userDao.updateFreeze(uid,freeze);
    }

    @Override
    public List<User> getAllguan() {
        return userDao.getAllguan();
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public int updateGuan(Integer uid,String phone,String password,String nickname,String modifyDate,String autograph) {
        return userDao.updateGuan(uid,phone,password,nickname,modifyDate,autograph);
    }

    @Override
    public int pan(String phone, String password) {
        return userDao.pan(phone,password);
    }

}
