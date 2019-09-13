package cn.bdqn.pnback.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class tiaozhuanController {

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("welcome.html")
    public String indexc(){
        return "welcome";
    }
}
