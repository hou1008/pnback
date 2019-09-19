package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.Comment;
import cn.bdqn.pnback.service.CommentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService CommentService;
    @RequestMapping("/member-record-browse.html")
    public String chc(){
        return "member-record-browse";
    }
    @ResponseBody
    @RequestMapping("cha")
    public String cha(){
        List<Comment> list=CommentService.cha();
         return   JSON.toJSONString(list);
    }
    @RequestMapping("shan")
    public String shan(int id){
        int a=CommentService.shan(id);
        System.out.print(a);
        if(a>0) {
            return "forward:member-record-browse.html";
        }else {
            return"member-record-browse.html";
        }
    }
}
