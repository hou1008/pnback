package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.User;
import cn.bdqn.pnback.service.UserService;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.beans.Transient;
import java.util.List;

//D:\票牛后\pn_backstage\src\main\java\cn\bdqn\pn_backstage\controller\UserController.java

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    //查找用户全部信息
    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        List<User> usera=userService.getAll();
        System.out.print("***********");
        return JSON.toJSONString(usera);
    }
    //查找冻结用户
    @ResponseBody
    @RequestMapping("/getAlldong")
    public String getAlldong(){
        List<User> useraa=userService.getAlldong();
        System.out.print("-------------");
        return  JSON.toJSONString(useraa);
    }
    //修改冻结用户
    @ResponseBody
    @RequestMapping("/updateFrezee/{uid}/{freeze}")
    public String updateFreeze(@PathVariable("uid") Integer uid , @PathVariable("freeze") Integer freeze){
        Integer data =userService.updateFreeze(uid,freeze);
        System.out.print("+======");
        return JSON.toJSONString(data);
    }
    //查找管理员全部信息
    @ResponseBody
    @RequestMapping("/getAllguan")
    public String getAllguan(User user ){
        List<User> getGuan=userService.getAllguan();
        System.out.print("         ");
        return JSON.toJSONString(getGuan);
    }


    //模糊查找框
    @ResponseBody
    @RequestMapping("/getAllcha/{phone}")
    public String getAllcha(@PathVariable("phone") String phone){
        List<User> chaph=userService.getAllcha(phone);
        System.out.print(phone);
        return JSON.toJSONString(chaph);
    }


    //修改管理员信息
    @RequestMapping("/getAllid/{uid}")
    public String getAllid(@PathVariable("uid") Integer uid, Model model){
        User user=userService.getAllid(uid);
        model.addAttribute("user",user);
        System.out.print(uid);
        return "admin-add";
    }
    //修改密码
    @RequestMapping("/getAllidPwd/{uid}")
    public String getAllidPwd(@PathVariable("uid") Integer uid, Model model){
        User user=userService.getAllid(uid);
        model.addAttribute("user",user);
        System.out.print("123456789+"+user.getNickname());
        return "change-password";
    }

    @ResponseBody
    @RequestMapping("/updatepwd")
    public String updatepwd(HttpServletRequest request,User user){
        Integer pwd=userService.updatepwd(user);
        System.out.print("************"+pwd);
        return JSON.toJSONString(pwd);
    }


    //修改管理员信息
    @ResponseBody
    @RequestMapping("/updateGuan")
    public String updateGuan(HttpServletRequest request,User user){
        Integer Guan=userService.updateGuan(user);
        System.out.print("$$$$$$$$$$$$"+Guan);
        return JSON.toJSONString(Guan);
    }

//登录
    @ResponseBody
    @RequestMapping("/pan")
    public String pan(HttpServletRequest request){
        String phone = request.getParameter("phone");
        String pass = request.getParameter("pass");
        System.out.println(phone);
        System.out.println(pass);
        int res = userService.pan(phone,pass);
        return JSON.toJSONString(res);
    }


}
