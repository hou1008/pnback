package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Consults;
import cn.bdqn.pnback.service.ConsultsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/consults")
public class ConsultsController {

    @Autowired
    private ConsultsService consultsService;

    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        List<Consults> list =consultsService.getAll();
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

}
