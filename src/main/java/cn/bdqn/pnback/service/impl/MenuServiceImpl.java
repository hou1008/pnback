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
    @Override
    public int getCount() {
        return menuDao.getCount();
    }

    @Override
    public List<Menu> getConsultsPage(int index, int pageCount) {
        return menuDao.getConsultsPage(index,pageCount);
    }

    @Override
    public Integer add(Menu menu) {
        return menuDao.add(menu);
    }

    @Override
    public Menu getId(Integer id) {
        return menuDao.getId(id);
    }

    @Override
    public Integer update(Menu menu) {
        return menuDao.update(menu);
    }

    @Override
    public Integer del(Integer id) {
        return menuDao.del(id);
    }



}
