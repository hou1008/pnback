package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.ClassifyDao;
import cn.bdqn.pnback.pojo.Classify;
import cn.bdqn.pnback.pojo.Menu;
import cn.bdqn.pnback.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyDao ClassifyDao;

    @Override
    public int zeng(Menu menu) {
        return ClassifyDao.zeng(menu);
    }
}
