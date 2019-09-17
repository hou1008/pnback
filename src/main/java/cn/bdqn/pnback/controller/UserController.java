package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.User;
import cn.bdqn.pnback.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    //修改冻结用户
    @ResponseBody
    @RequestMapping("/updateFrezee")
    public int updateFreeze(User user){
        User user1= new User();
        user1.setUid(16);
        user1.setFreeze(2);
        Integer a =userService.updateFreeze(user1);
        System.out.print("+======");
        return a;
    }
    //查找管理员全部信息
    @ResponseBody
    @RequestMapping("/getAllguan")
    public String getAllguan(User user){
        List<User> getGuan=userService.getAllguan();
        System.out.print("+++++++++");
        return JSON.toJSONString(getGuan);
    }

    //修改管理员信息
    @ResponseBody
    @RequestMapping("/updateGuan")
    public Integer updateGuan(User user){
        User userGuan=new User();
        userGuan.setPhone("97611573");
        userGuan.setPassword("12345678");
        userGuan.setNickname("呵呵呵");
        userGuan.setAutograph("可以呀");
        userGuan.setModifyDate("1998/06/03");
        userGuan.setUser_photo("asdqwdasdqwd 、、q");
        userGuan.setUid(16);
        Integer Guan=userService.updateGuan(userGuan);
        System.out.print("+++++++++");
        return Guan;
    }


}
