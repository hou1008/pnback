package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.MenuDao;
import cn.bdqn.pnback.pojo.Menu;
import cn.bdqn.pnback.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> lala(int pid) {
        return menuDao.lala(pid);
    }
    @Override
    public List<Menu> lala1(int pid) {
        return menuDao.lala1(pid);
}
    @Override
    public List<Menu> lala2(int pid) {
        return menuDao.lala2(pid);
    }
}
