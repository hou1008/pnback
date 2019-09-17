package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Consults;
import cn.bdqn.pnback.pojo.Trouble;
import cn.bdqn.pnback.service.TroubleService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/trouble")
public class TroubleController {
    @Autowired
    private TroubleService troubleService;

    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        List<Trouble> list =troubleService.getAll();
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("/add")
    public String add(Trouble trouble){
        Integer res = troubleService.add(trouble);
        return JSON.toJSONString(res);
    }

    @RequestMapping("getId/{tId}")
    public String getId(@PathVariable Integer tId, Model model){
        Trouble trouble = troubleService.getId(tId);
        model.addAttribute("tro",trouble);
        return "changjianwenti-upd";
    }

    @ResponseBody
    @RequestMapping("/update")
    public String update(Trouble trouble){
        int res=troubleService.update(trouble);
        return JSON.toJSONString(res);
    }

    @ResponseBody
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        int res=troubleService.del(id);
        return JSON.toJSONString(res);
    }
}
