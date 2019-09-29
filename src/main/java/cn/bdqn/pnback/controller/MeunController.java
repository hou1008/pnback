package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Menu;
import cn.bdqn.pnback.service.MenuService;
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
@RequestMapping("/menu")
public class MeunController {
    @Autowired
    private  MenuService menuService;

//    @RequestMapping("/charts-2.html")
//    public String charts2(){
//        return "charts-2";
//    }

    /**
     *分页查询
     */
    @ResponseBody
    @RequestMapping("/getAll/{index}")
    public String page(@PathVariable int index, Model model){
        Page page = new Page();
        page.setCount(menuService.getCount());
        if(index<1)index=1;
        if(index>page.getPageSum())index=page.getPageSum();
        page.setPageIndex(index);
        page.setMenu(menuService.getConsultsPage((page.getPageIndex()-1)*page.getPageCount(),page.getPageCount()));
        return JSON.toJSONString(page);
    }
    @ResponseBody
    @RequestMapping("/add")
    public String add(Menu menu){
        Integer res = menuService.add(menu);
        return JSON.toJSONString(res);
    }

    @RequestMapping("getId/{id}")
    public String getId(@PathVariable Integer id, Model model){
        Menu menu = menuService.getId(id);
        model.addAttribute("dis",menu);
        return "diqu-upd";
    }

    @ResponseBody
    @RequestMapping("/update")
    public String update(Menu menu){
        int res=menuService.update(menu);
        return JSON.toJSONString(res);
    }

    @ResponseBody
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        int res=menuService.del(id);
        return JSON.toJSONString(res);
    }


    @RequestMapping("/zhan")
    @ResponseBody
    public String zhan(){

        List<Menu> list= menuService.lala(1);
        return JSON.toJSONString(list);
    }
    @RequestMapping("/zhan1")
    @ResponseBody
    public String zhan1(){

        List<Menu> list= menuService.lala1(2);
        return JSON.toJSONString(list);
    }
    @RequestMapping("/zhan2")
    @ResponseBody
    public String zhan2(){

        List<Menu> list= menuService.lala2(3);
        return JSON.toJSONString(list);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.println(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int b = Integer.parseInt(strs[i]);
                menuService.del(b);
            } catch (Exception e) {
            }
        }
    }

    @RequestMapping("/zeng")
    public String zeng(Menu menu){
        Integer res = menuService.zeng(menu);
        System.out.println(menu.getName());
        return "redirect:/charts-2.html";


    }
}
