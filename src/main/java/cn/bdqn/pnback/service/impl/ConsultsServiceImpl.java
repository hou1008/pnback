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
    public List<Consults> getAll() {
        return consultsDao.getAll();
    }
}
