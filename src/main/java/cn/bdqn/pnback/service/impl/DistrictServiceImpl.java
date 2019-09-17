package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.DistrictDao;
import cn.bdqn.pnback.pojo.District;
import cn.bdqn.pnback.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DistrictService")
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictDao districtDao;
    @Override
    public List<District> getAll() {
        return districtDao.getAll();
    }

    @Override
    public Integer add(District district) {
        return districtDao.add(district);
    }

    @Override
    public District getId(Integer id) {
        return districtDao.getId(id);
    }

    @Override
    public Integer update(District district) {
        return districtDao.update(district);
    }

    @Override
    public Integer del(Integer id) {
        return districtDao.del(id);
    }
}
