package cn.bdqn.pnback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsultsController {



    @RequestMapping("/toindex")
    public String toindex(){
        return "index";
    }
}