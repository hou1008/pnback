package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.District;
import cn.bdqn.pnback.pojo.Trouble;
import cn.bdqn.pnback.service.DistrictService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        List<District> list =districtService.getAll();
        return JSON.toJSONString(list);
    }
    @ResponseBody
    @RequestMapping("/add")
    public String add(District district){
        Integer res = districtService.add(district);
        return JSON.toJSONString(res);
    }

    @RequestMapping("getId/{dId}")
    public String getId(@PathVariable Integer dId, Model model){
        District district = districtService.getId(dId);
        model.addAttribute("dis",district);
        return "diqu-upd";
    }

    @ResponseBody
    @RequestMapping("/update")
    public String update(District district){
        int res=districtService.update(district);
        return JSON.toJSONString(res);
    }

    @ResponseBody
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        int res=districtService.del(id);
        return JSON.toJSONString(res);
    }
}
