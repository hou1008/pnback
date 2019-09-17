package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Consults;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConsultsService {

    List<Consults> getAll();
    int add(Consults consults);
    //id查
    Consults getConsults(Integer id);
    Integer update(Consults consults);

    int del(Integer id);
}
