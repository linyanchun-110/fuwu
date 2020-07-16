package com.hzit.goods.sevice;

import com.hzit.goods.vo.Item;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@Component
//@FeignClient(value="goods")
public interface ItemService {
//    @GetMapping("/item/{id}")
    public Item queryById(@PathVariable("id") Long id);

}
