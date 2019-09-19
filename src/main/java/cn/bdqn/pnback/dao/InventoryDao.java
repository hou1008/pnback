package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Inventory;

import java.util.List;

public interface InventoryDao {
    List<Inventory> jiucha();
    List<Inventory> jiucha1();
    Inventory idcha(int tId);
    Inventory idcha1(int tId);
    List<Inventory> leicha();
}
