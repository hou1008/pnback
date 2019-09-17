package cn.bdqn.pnback.service;

import cn.bdqn.pnback.pojo.District;

import java.util.List;

public interface DistrictService {
    List<District> getAll();
    Integer add(District district);
    District getId(Integer id);
    Integer update(District district);
    Integer del(Integer id);
}
