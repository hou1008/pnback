package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.Inventory;
import cn.bdqn.pnback.service.InventoryService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InventoryController {
    @Autowired
    private InventoryService InventoryService;

    @ResponseBody
    @RequestMapping("idcha")
    public String aaa(){
        Inventory list=InventoryService.idcha(1);
        return JSON.toJSONString(list);
    }
    @ResponseBody
    @RequestMapping("leicha")
    public String aaa22(){
        List<Inventory> list=InventoryService.leicha();
        System.out.println(list.size());
        return JSON.toJSONString(list);
    }
}
