package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.Goods;
import cn.bdqn.pnback.service.GoodsService;
import cn.bdqn.pnback.util.Page;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    @ResponseBody
    @RequestMapping("/del/{gId}")
    public  String del(@PathVariable Integer gId){
        Integer res = goodsService.del(gId);
        return JSON.toJSONString(res);
    }
    @ResponseBody
    @RequestMapping("/add")
    public String add(HttpServletRequest request, Goods goods){
        Integer res=goodsService.add(goods);
        return  JSON.toJSONString(res);
    }
    @RequestMapping("/toUpd/{gId}")
    public String toUpd(@PathVariable Integer gId,Model model){
       Goods good=goodsService.getGoodsById(gId);
        model.addAttribute("good",good);
        return "article-upd";
    }
    @ResponseBody
    @RequestMapping("/update")
    public String update(HttpServletRequest request,Goods goods){
       Integer res=goodsService.upd(goods);
        return JSON.toJSONString(res);
    }
//    @RequestMapping("/updata")
//    public  String updata(HttpServletRequest request,Goods goods){
//        System.out.print("qwert");
//        Integer res=goodsService.upd(goods);
//        if(res>0){
//            return "article-list";
//        }else {
//            return "article-upd";
//        }
//        }

}
