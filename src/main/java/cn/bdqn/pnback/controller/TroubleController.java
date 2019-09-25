package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Trouble;
import cn.bdqn.pnback.service.TroubleService;
import cn.bdqn.pnback.util.Page;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/trouble")
public class TroubleController {
    @Autowired
    private TroubleService troubleService;

    /**
     *分页查询
     */
    @ResponseBody
    @RequestMapping("/getAll/{index}")
    public String page(@PathVariable int index, Model model){
        Page page = new Page();
        page.setCount(troubleService.getCount());
        if(index<1)index=1;
        if(index>page.getPageSum())index=page.getPageSum();
        page.setPageIndex(index);
        page.setTrouble(troubleService.getConsultsPage((page.getPageIndex()-1)*page.getPageCount(),page.getPageCount()));
        return JSON.toJSONString(page);
    }

    @ResponseBody
    @RequestMapping("/getAll1/{name}")
    public String getAll(@PathVariable String name){
        List<Trouble> list = troubleService.getMohu(name);
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

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.println(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int b = Integer.parseInt(strs[i]);
                troubleService.del(b);
            } catch (Exception e) {
            }
        }
    }
}
