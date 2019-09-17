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
    public Inventory idcha(int tId) {
        return InventoryDao.idcha(tId);
    }

    @Override
    public List<Inventory> leicha() {
        return InventoryDao.leicha();
    }


}
