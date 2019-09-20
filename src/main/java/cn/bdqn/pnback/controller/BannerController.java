package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Banner;
import cn.bdqn.pnback.service.BannerService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService BannerService;

    @RequestMapping("/tcha")
    @ResponseBody
    public  String tcha(){
        List<Banner> list=BannerService.tcha(1);
        System.out.println(list.size());
        return JSON.toJSONString(list);
    }
    @RequestMapping("/tgai/{id}")
    @ResponseBody
    public  String tgai(@PathVariable("id") int id){
        int a=BannerService.tgai(id);
        System.out.println(id);
        return JSON.toJSONString(a);
    }
}
