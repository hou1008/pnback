package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Banner;
import cn.bdqn.pnback.service.BannerService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService BannerService;

    @RequestMapping("/tcha")
    @ResponseBody
    public String tcha() {
        List<Banner> list = BannerService.tcha(1);
        System.out.println(list.size());
        return JSON.toJSONString(list);
    }

    @RequestMapping("/tgai/{id}")
    @ResponseBody
    public String tgai(@PathVariable("id") int id) {
        int a = BannerService.tgai(id);
        System.out.println(id);
        return JSON.toJSONString(a);
    }

    @RequestMapping("/tcha1")
    @ResponseBody
    public String tcha1() {
        List<Banner> list = BannerService.tcha1(2);
        System.out.println(list.size());
        return JSON.toJSONString(list);
    }

    @RequestMapping("/tgai1/{id}")
    @ResponseBody
    public String tgai1(@PathVariable("id") int id) {
        int a = BannerService.tgai1(id);
        return JSON.toJSONString(a);
    }

    @RequestMapping("/zjia")
    public String add1551(@RequestParam("uploadFile") MultipartFile file, HttpServletRequest request, Banner banner) throws IOException {
        String fileName = file.getOriginalFilename();   //获取文件名
        System.out.println(fileName);
        String suffixName = fileName.substring(fileName.lastIndexOf(".")); //获取后缀名
        System.out.println(suffixName);
        String filePath = "D:\\img";        //文件上传路径
        fileName = UUID.randomUUID() + suffixName;
        File dest = new File(filePath + fileName);
        file.transferTo(dest);
        banner.setbPhoto("../img/" + fileName);
        System.out.println(banner.getId());
        banner.setgId(1);

        BannerService.zjia(banner);
        return "redirect:/system-category.html";

    }
}