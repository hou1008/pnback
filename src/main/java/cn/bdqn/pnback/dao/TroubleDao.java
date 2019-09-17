package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.Trouble;

import java.util.List;

public interface TroubleDao {
    List<Trouble> getAll();
    Integer add(Trouble trouble);

    Trouble getId(Integer id);
    Integer update(Trouble trouble);
    Integer del(Integer id);
}
