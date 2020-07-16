package com.hzit.order.service.impl;

import com.hzit.order.client.FeginOrderService;
import com.hzit.order.config.OrderConfig;
import com.hzit.order.service.OrderService;
import com.hzit.order.vo.Item;
import com.hzit.order.vo.Order;
import com.hzit.order.vo.OrderDetail;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private RestTemplate restTemplate;
    private static final Logger logger= LoggerFactory.getLogger(OrderServiceImpl.class);
   @Autowired
    private OrderConfig orderConfig;
   @Autowired
   private FeginOrderService feginOrderService;

    @Override
    @HystrixCommand(fallbackMethod = "fallBackMethod")
    public Order feginCreate() {
        Item item=feginOrderService.queryById(1L);
        Order order=new Order();
        long orderId=System.currentTimeMillis();
        order.setOrderId(orderId);
        order.setUserId(1);
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setItem(item);
        order.setOrderDetail(orderDetail);
        return order;
    }

    @Override
    public Order restCreate() {
        Order order=new Order();
        long orderId=System.currentTimeMillis();
        order.setOrderId(orderId);
        order.setUserId(1);
        OrderDetail orderDetail=new OrderDetail();
        logger.info("从goods server中取拿取数据");
        long id=1L;
        String url=orderConfig.getItemUrl()+"/item/"+id;
        Item item=restTemplate.getForObject(url,Item.class);
        logger.info("返回的数据为{}",item);
        orderDetail.setItem(item);//item要从goods服务中拿，先用restempalte，注册一个bean
        order.setOrderDetail(orderDetail);
        return order;
    }
    public Order fallBackMethod(){
        System.out.println("服务容错");
        return null;
    }
}
