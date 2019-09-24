package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.TroubleDao;
import cn.bdqn.pnback.pojo.Trouble;
import cn.bdqn.pnback.service.TroubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("TroubleService")
public class TroubleServiceImpl implements TroubleService {

    @Autowired
    private TroubleDao troubleDao;


    @Override
    public int getCount() {
        return troubleDao.getCount();
    }

    @Override
    public List<Trouble> getConsultsPage(int index, int pageCount) {
        return troubleDao.getConsultsPage(index,pageCount);
    }

    @Override
    public Integer add(Trouble trouble) {
        return troubleDao.add(trouble);
    }

    @Override
    public Trouble getId(Integer id) {
        return troubleDao.getId(id);
    }

    @Override
    public Integer update(Trouble trouble) {
        return troubleDao.update(trouble);
    }

    @Override
    public Integer del(Integer id) {
        return troubleDao.del(id);
    }

    @Override
    public List<Trouble> getMohu(String name) {
        return troubleDao.getMohu(name);
    }
}
