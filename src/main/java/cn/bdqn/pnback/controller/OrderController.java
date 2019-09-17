package cn.bdqn.pnback.controller;

import cn.bdqn.pnback.pojo.Order;
import cn.bdqn.pnback.service.OrderService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
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
    @RequestMapping("/getAll")
    public String getAll(){
        List<Order> order1=orderService.getAll();
        System.out.print("*************");
        /*getAllgeng();*/
        return JSON.toJSONString(order1);
    }

/*    @Scheduled(cron = "0/3 * * * * ?")
    public String getAllgeng(){
        List<Order> order2=orderService.getAllgeng();
        System.out.print(order2);
        return JSON.toJSONString(order2);
    }*/


}
