package cn.bdqn.pnback.dao;

import cn.bdqn.pnback.pojo.District;

import java.util.List;

public interface DistrictDao {
    List<District> getAll();
    Integer add(District district);
    District getId(Integer id);
    Integer update(District district);
    Integer del(Integer id);
}
