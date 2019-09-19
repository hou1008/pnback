package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Order;
import cn.bdqn.pnback.service.OrderService;
import cn.bdqn.pnback.util.Page;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resources;
import java.util.List;

@Controller
@Component
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    public OrderService orderService;

@ResponseBody
@RequestMapping("/getorder/{index}")
public String getorder(@PathVariable int index, Model model){
    Page page = new Page();
    page.setCount(orderService.getCount());
    if (index<1) index = 1;
    if (index>page.getPageSum())index=page.getPageSum();
    page.setPageIndex(index);
    page.setOrder(orderService.getorder((page.getPageIndex()-1)*page.getPageCount(),page.getPageCount()));
    return JSON.toJSONString(page);
}



    @ResponseBody
    @RequestMapping("/getsou/{oBianhao}")
    public String getsou(@PathVariable Integer oBianhao){
        List<Order> sou=orderService.getsou(oBianhao);
        System.out.print(JSON.toJSONString(sou));
    return JSON.toJSONString(sou);
    }



/*    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        List<Order> order1=orderService.getAll();
        System.out.print("*************");
*//*        getAllgeng();*//*
        return JSON.toJSONString(order1);
    }*/

    //定时任务
/*    @Scheduled(cron = "0/3 * * * * ?")
    public String getAllgeng(){
        List<Order> order2=orderService.getAllgeng();
        System.out.print(order2);
        return JSON.toJSONString(order2);
    }*/


}
