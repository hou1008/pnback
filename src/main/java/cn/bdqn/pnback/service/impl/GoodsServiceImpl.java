package cn.bdqn.pnback.service.impl;


import cn.bdqn.pnback.dao.GoodsDao;
import cn.bdqn.pnback.pojo.Goods;
import cn.bdqn.pnback.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public int getCount() {
        return goodsDao.getCount();
    }

    @Override
    public List<Goods> getGoodsPage(int index, int pageCount) {
        return goodsDao.getGoodsPage(index,pageCount);
    }
}



