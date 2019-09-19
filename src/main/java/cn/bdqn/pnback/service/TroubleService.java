package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.Trouble;

import java.util.List;

public interface TroubleService {

    List<Trouble> getAll();
    Integer add(Trouble trouble);

    Trouble getId(Integer id);
    Integer update(Trouble trouble);
    Integer del(Integer id);
}
