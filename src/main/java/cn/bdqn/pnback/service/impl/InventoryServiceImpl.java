package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.InventoryDao;
import cn.bdqn.pnback.pojo.Inventory;
import cn.bdqn.pnback.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    public InventoryDao InventoryDao;

    @Override
    public List<Inventory> jiucha() {
        return InventoryDao.jiucha();
    }

    @Override
    public List<Inventory> jiucha1() {
        return InventoryDao.jiucha1();
    }

    @Override
    public Inventory idcha(int tId) {
        return InventoryDao.idcha(tId);
    }

    @Override
    public Inventory idcha1(int tId) {
        return InventoryDao.idcha1(tId);
    }

    @Override
    public List<Inventory> leicha() {
        return InventoryDao.leicha();
    }

    @Override
    public List<Inventory> leicha1(int id) {
        return InventoryDao.leicha1(id);
    }


}
