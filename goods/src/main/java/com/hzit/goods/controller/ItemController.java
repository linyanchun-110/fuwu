package com.hzit.goods.controller;

import com.hzit.goods.sevice.ItemService;
import com.hzit.goods.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/item/{id}")
     public Item queryById(@PathVariable("id") Long id){
     return itemService.queryById(id);
    }
}
