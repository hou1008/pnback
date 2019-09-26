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
    public List<User> getAllcha(String phone) {
        return userDao.getAllcha(phone);
    }

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
    public int updateGuan(User user) {
        return userDao.updateGuan(user);
    }

    @Override
    public int updatepwd(User user) {
        return userDao.updatepwd(user);
    }

    @Override
    public int insertuser(User user) {
        return userDao.insertuser(user);
    }

    @Override
    public int updateGuan(Integer uid, String phone, String password, String nickname, String modifyDate, String autograph) {
        return 0;
    }

    @Override
    public User getAllid(Integer uid) {
        return userDao.getAllid(uid);
    }

   /* @Override
    public User getAllid(Integer uid) {
        return userDao.getAllid(uid);
    }*/

    @Override
    public int pan(String phone, String password) {
        return userDao.pan(phone,password);
    }

}
