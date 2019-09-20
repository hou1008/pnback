package cn.bdqn.pnback.service.impl;

import cn.bdqn.pnback.dao.BannerDao;
import cn.bdqn.pnback.pojo.Banner;
import cn.bdqn.pnback.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerServiceImpl implements BannerService  {
    @Autowired
    private BannerDao BannerDao;
    @Override
    public List<Banner> tcha(int zhuangtai) {
        return BannerDao.tcha(zhuangtai);
    }

    @Override
    public int tgai(int id) {
        return BannerDao.tgai(id);
    }


}
