package cn.bdqn.pnback.controller;


import cn.bdqn.pnback.pojo.User;
import cn.bdqn.pnback.service.UserService;
import com.alibaba.fastjson.JSON;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.util.DigestUtils;

import javax.imageio.ImageIO;
import javax.jws.WebParam;
import javax.servlet.ServletOutputStream;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.beans.Transient;
import java.io.ByteArrayOutputStream;
import java.util.List;

//D:\票牛后\pn_backstage\src\main\java\cn\bdqn\pn_backstage\controller\UserController.java

@Controller
@RequestMapping("/User")
public class UserController {
    private Integer uidd;
    private String ph;
    @Autowired
    private UserService userService;

    //查找用户全部信息
    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll() {
        List<User> usera = userService.getAll();
        System.out.print("***********");
        return JSON.toJSONString(usera);
    }

    //查找冻结用户
    @ResponseBody
    @RequestMapping("/getAlldong")
    public String getAlldong() {
        List<User> useraa = userService.getAlldong();
        System.out.print("-------------");
        return JSON.toJSONString(useraa);
    }

    //修改冻结用户
    @ResponseBody
    @RequestMapping("/updateFrezee/{uid}/{freeze}")
    public String updateFreeze(@PathVariable("uid") Integer uid, @PathVariable("freeze") Integer freeze) {
        Integer data = userService.updateFreeze(uid, freeze);
        System.out.print("+======");
        return JSON.toJSONString(data);
    }

    //查找管理员全部信息
    @ResponseBody
    @RequestMapping("/getAllguan")
    public String getAllguan(User user) {
        List<User> getGuan = userService.getAllguan();
        System.out.print("         ");
        return JSON.toJSONString(getGuan);
    }


    //模糊查找框
    @ResponseBody
    @RequestMapping("/getAllcha/{phone}")
    public String getAllcha(@PathVariable("phone") String phone) {
        List<User> chaph = userService.getAllcha(phone);
        System.out.print(phone);
        return JSON.toJSONString(chaph);
    }


    //修改管理员信息
    @RequestMapping("/getAllid/{uid}")
    public String getAllid(@PathVariable("uid") Integer uid, Model model) {
        User user = userService.getAllid(uid);
        model.addAttribute("user", user);
        System.out.print(uid);
        return "admin-add";
    }

/*    @RequestMapping("/zeng")
    public String zeng() throws Exception{
        throw new Exception("发生错误");
    }*/
    @RequestMapping("/zeng")
    public String zeng(){
        return "admin-zeng";
    }
    /*        INSERT INTO `ticket`.`user` (`phone`,`password`,`nickname`,`type`,`autograph`,`creationDate`) VALUES(#{phone},#{password},#{nickname},'1',#{autograph},#{creationDate})
*/

    @ResponseBody
    @RequestMapping("/insertGuan")
    public String insertGuan(HttpServletRequest request,User user){
        Integer insertG = userService.insertGuan(user);
        return JSON.toJSONString(insertG);
    }



    //修改密码
    @RequestMapping("/getAllidPwd/{uid}")
    public String getAllidPwd(@PathVariable("uid") Integer uid, Model model) {
        User user = userService.getAllid(uid);
        model.addAttribute("user", user);
        System.out.print("123456789+" + user.getNickname());
        return "change-password";
    }

    @ResponseBody
    @RequestMapping("/updatepwd")
    public String updatepwd(HttpServletRequest request, User user) {
        Integer pwd = userService.updatepwd(user);
        System.out.print("************" + pwd);
        return JSON.toJSONString(pwd);
    }


    //修改管理员信息
    @ResponseBody
    @RequestMapping("/updateGuan")
    public String updateGuan(HttpServletRequest request, User user) {
        Integer Guan = userService.updateGuan(user);
        System.out.print("$$$$$$$$$$$$" + Guan);
        return JSON.toJSONString(Guan);
    }
    //修改管理员信息
    @ResponseBody
    @RequestMapping("/updateGuan/{phone}/{password}/{nickname}/{modifyDate}/{autograph}") public Integer updateGuan (@PathVariable("phone") String phone, @PathVariable("password") String password, @PathVariable("nickname") String nickname, @PathVariable("modifyDate") String modifyDate, @PathVariable("autograph") String autograph){
        Integer Guan = userService.updateGuan(uidd, phone, password, nickname, autograph, modifyDate);
        System.out.print("$$$$$$$$$$$$" + Guan);
        return Guan;
    }
    @ResponseBody
    @RequestMapping("/insertUser/{phone}/{nickname}/{autograph}/{creationDate}/{password}")
    public String insertUser (@PathVariable("phon") String phon, @PathVariable("nickname") String nickname, @PathVariable("autograph") String autograph, @PathVariable("creationDate") String creationDate, @PathVariable("password") String password, User user){
        user.setPhone(phon);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setAutograph(autograph);
        user.setCreationDate(creationDate);
        Integer tian = userService.insertuser(user);
        System.out.print("**********" + user.getPhone());
        return JSON.toJSONString(tian);
    }


    //登录
    @ResponseBody
    @RequestMapping("/pan/{phone}")
    public String pan (HttpServletRequest request){
        String phone = request.getParameter("phone");
        String pass = request.getParameter("pass");

        User user = new User();
        user.setPassword(pass);
        String md5password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());

        ph = phone;

        System.out.println(phone);
        System.out.println(md5password);
        int res = userService.pan(phone, md5password);
        return JSON.toJSONString(res);
    }
    @Autowired
    private DefaultKaptcha defaultKaptcha;
    //验证码
    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha (HttpServletRequest request, HttpServletResponse response) throws Exception {
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中,
            String createText = defaultKaptcha.createText();
            request.getSession().setAttribute("verifyCode", createText);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                response.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    //确认验证码
    @GetMapping("/verifyCode/{verification}")
    @ResponseBody
    public Integer imgverifyControllerDefaultKaptcha (HttpServletRequest
                                                              request, @PathVariable("verification") String verifyCode){
        String captchaId = (String) request.getParameter("verification");
        System.out.println("验证码是：" + captchaId);
        System.out.println("用户输入的是：" + verifyCode);
        if (!captchaId.equals(verifyCode)) {
            System.out.println("输入错误");
            return 0;
        }
        System.out.println("输入正确");
        return 1;
    }

}