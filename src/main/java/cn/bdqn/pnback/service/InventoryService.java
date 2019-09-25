package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Inventory;

import java.util.List;

public interface InventoryService {
    List<Inventory> jiucha();
    List<Inventory> jiucha1();
    Inventory idcha(int tId);
    Inventory idcha1(int tId);
    List<Inventory> leicha();
    List<Inventory> leicha1(int id);
}
