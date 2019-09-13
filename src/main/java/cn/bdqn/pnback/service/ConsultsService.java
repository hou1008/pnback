package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Consults;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConsultsService {

    List<Consults> getAll();
}
