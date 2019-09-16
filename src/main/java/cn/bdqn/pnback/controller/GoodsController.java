package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.service.GoodsService;
import cn.bdqn.pnback.util.Page;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     *分页查询
     */
    @ResponseBody
    @RequestMapping("/page/{index}")
    public String page(@PathVariable int index, Model model){
        Page page = new Page();
        page.setCount(goodsService.getCount());
        if(index<1)index=1;
        if(index>page.getPageSum())index=page.getPageSum();
        page.setPageIndex(index);
        page.setGoods(goodsService.getGoodsPage((page.getPageIndex()-1)*page.getPageCount(),page.getPageCount()));
        return JSON.toJSONString(page);
    }
}
