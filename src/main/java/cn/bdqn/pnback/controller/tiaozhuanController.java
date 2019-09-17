package cn.bdqn.pnback.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class tiaozhuanController {

    @RequestMapping("index.html")
    public String index() {
        return "index";
    }

    @RequestMapping("welcome.html")
    public String indexc() {
        return "welcome";
    }

    @RequestMapping("shifenxianchang.html")
    public String shifenxianchang() {
        return "shifenxianchang";
    }

    @RequestMapping("shifenxianchang-add.html")
    public String shifenxianchangAdd() {
        return "shifenxianchang-add";
    }

    @RequestMapping("shifenxianchang-upd.html")
    public String shifenxianchangUpd() {
        return "shifenxianchang-add";
    }

    @RequestMapping("faxian.html")
    public String faxian() {
        return "faxian";
    }
    @RequestMapping("changjianwenti.html")
    public String changjianwenti() {
        return "changjianwenti";
    }
    @RequestMapping("changjianwenti-add.html")
    public String changjianwentiAdd() {
        return "changjianwenti-add";
    }

    @RequestMapping("article-list.html")
    public String articleList(){return "article-list";}

    @RequestMapping("diqu.html")
    public String diqu(){return "diqu";}
    @RequestMapping("diqu-add.html")
    public String diquAdd(){return "diqu-add";}
    @RequestMapping("diqu-upd.html")
    public String diquUpd(){return "diqu-upd";}
}