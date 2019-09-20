package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Menu;
import cn.bdqn.pnback.service.MenuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class MeunController {
    @Autowired
    private  MenuService MenuService;

//    @RequestMapping("/charts-2.html")
//    public String charts2(){
//        return "charts-2";
//    }

    @RequestMapping("/zhan")
    @ResponseBody
    public String zhan(){

        List<Menu> list= MenuService.lala(1);
        return JSON.toJSONString(list);
    }
    @RequestMapping("/zhan1")
    @ResponseBody
    public String zhan1(){

        List<Menu> list= MenuService.lala1(2);
        return JSON.toJSONString(list);
    }
    @RequestMapping("/zhan2")
    @ResponseBody
    public String zhan2(){

        List<Menu> list= MenuService.lala2(3);
        return JSON.toJSONString(list);
    }
}
