package cn.bdqn.pnback.dao;


import cn.bdqn.pnback.pojo.Consults;

import java.util.List;

public interface ConsultsDao {
    List<Consults> getAll();
    int add(Consults consults);

    //id查
    Consults getConsults(Integer id);
    Integer update(Consults consults);

    int del(Integer id);
}
