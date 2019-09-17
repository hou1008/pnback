package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Classify;
import cn.bdqn.pnback.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassifyController {

        @Autowired
    private ClassifyService ClassifyService;

        @RequestMapping("/zeng")
    public String add(Classify classify){

            int a=ClassifyService.zeng(classify);
            if(a>0){
                return "index.html";
            }else{
                return "product-category-add.html";
            }
        }
}
