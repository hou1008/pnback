package cn.bdqn.pnback.service.impl;


import cn.bdqn.pnback.dao.ConsultsDao;
import cn.bdqn.pnback.pojo.Consults;
import cn.bdqn.pnback.service.ConsultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ConsultsService")
public class ConsultsServiceImpl implements ConsultsService {

    @Autowired
    private ConsultsDao consultsDao;


    @Override
    public List<Consults> getMohu(String zxName) {
        return consultsDao.getMohu(zxName);
    }

    @Override
    public int add(Consults consults) {
        return consultsDao.add(consults);
    }

    @Override
    public Consults getConsults(Integer id) {
        return consultsDao.getConsults(id);
    }

    @Override
    public Integer update(Consults consults) {
        return consultsDao.update(consults);
    }

    @Override
    public int del(Integer id) {
        return consultsDao.del(id);
    }

    @Override
    public int getCount() {
        return consultsDao.getCount();
    }

    @Override
    public List<Consults> getConsultsPage(int index, int pageCount) {
        return consultsDao.getConsultsPage(index,pageCount);
    }
}
