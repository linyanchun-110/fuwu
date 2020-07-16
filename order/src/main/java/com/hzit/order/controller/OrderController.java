package com.hzit.order.controller;
import com.hzit.order.service.OrderService;
import com.hzit.order.vo.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController{
    private static final Logger logger= LoggerFactory.getLogger(OrderController.class);
//    @Autowired
//    private ItemService itemService;
//    @RequestMapping("/item/{id}")
//    public Item queryById(@PathVariable("id") Long id){
//        return this.itemService.queryById(id);
//    }

    @Autowired
    private OrderService orderService;
    @RequestMapping("/rest")
    public Order testRest(){
        logger.info("接收到创建订单请求");
        Order order=orderService.restCreate();
        return order;
    }
    @RequestMapping("/fegin")
    public Order testRest1(){
        logger.info("接收到创建订单请求");
        Order order= orderService.feginCreate();
        return order;
    }

}