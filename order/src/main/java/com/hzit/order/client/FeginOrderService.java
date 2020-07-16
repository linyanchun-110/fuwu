package com.hzit.order.client;

import com.hzit.order.vo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "goods")
public interface FeginOrderService {
    @RequestMapping("/item/{id}")
    public Item queryById(@PathVariable("id") Long id);
}
