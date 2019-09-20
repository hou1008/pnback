package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Classify;
import cn.bdqn.pnback.pojo.Menu;
import cn.bdqn.pnback.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MenuController {
    @Autowired
    private MenuService MenuService;
    @RequestMapping("/zeng")
    public String add(Menu menu){
        int a=MenuService.zeng(menu);
        return "product-category";
    }
}
