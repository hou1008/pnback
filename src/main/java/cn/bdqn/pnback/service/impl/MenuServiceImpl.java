package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.MenuDao;
import cn.bdqn.pnback.pojo.Menu;
import cn.bdqn.pnback.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuDao menuDao;
    @Override
    public int zeng(Menu menu) {
        return menuDao.zeng(menu);
    }
}
