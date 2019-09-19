package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.Comment;
import cn.bdqn.pnback.service.CommentService;
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
public class CommentController {
    @Autowired
    private CommentService CommentService;
    @RequestMapping("/member-record-browse.html")
    public String chc(){
        return "member-record-browse";
    }
    @ResponseBody
    @RequestMapping("cha/{index}")
    public String cha(@PathVariable int index, Model model){
        Page page = new Page();
        page.setCount(CommentService.getCount());
        if(index<1)index=1;
        if(index>page.getPageSum())index=page.getPageSum();
        page.setPageIndex(index);
        page.setComment(CommentService.getCommentPage((page.getPageIndex()-1)*page.getPageCount(),page.getPageCount()));
        return JSON.toJSONString(page);


//        List<Comment> list=CommentService.cha();
//         return   JSON.toJSONString(list);
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
