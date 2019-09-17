package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Inventory;

import java.util.List;

public interface InventoryDao {
    Inventory idcha(int tId);
    List<Inventory> leicha();
}
