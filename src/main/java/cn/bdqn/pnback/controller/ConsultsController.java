package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Consults;
import cn.bdqn.pnback.service.ConsultsService;
import cn.bdqn.pnback.util.Page;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/consults")
public class ConsultsController {

    @Autowired
    private ConsultsService consultsService;

    /**
     *分页查询
     */
    @ResponseBody
    @RequestMapping("/getAll/{index}")
    public String page(@PathVariable int index, Model model){
        Page page = new Page();
        page.setCount(consultsService.getCount());
        if(index<1)index=1;
        if(index>page.getPageSum())index=page.getPageSum();
        page.setPageIndex(index);
        page.setConsults(consultsService.getConsultsPage((page.getPageIndex()-1)*page.getPageCount(),page.getPageCount()));
        return JSON.toJSONString(page);
    }

    @ResponseBody
    @RequestMapping("/getAll1/{zxName}")
    public String getAll(@PathVariable String zxName){
        List<Consults> list = consultsService.getMohu(zxName);
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("/add")
    public String add(Consults consults){
        int res = consultsService.add(consults);
       return JSON.toJSONString(res);
   }


    //id查

    @RequestMapping("getConsults/{cId}")
    public String getConsults(@PathVariable Integer cId, Model model){
        Consults consults = consultsService.getConsults(cId);
        model.addAttribute("con",consults);
        return "shifenxianchang-upd";
    }

    @ResponseBody
    @RequestMapping("/update")
    public String update(Consults consults){
        int res=consultsService.update(consults);
        return JSON.toJSONString(res);
    }
    @ResponseBody
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        int res=consultsService.del(id);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.pr intln(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int b = Integer.parseInt(strs[i]);

                consultsService.del(b);
            } catch (Exception e) {
            }
        }
    }





}
