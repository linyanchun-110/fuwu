package com.hzit.goods.sevice.impl;

import com.hzit.goods.sevice.ItemService;
import com.hzit.goods.vo.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService {
    private static final Map<Long,Item> ITEM_MAP=new HashMap<Long,Item>();
    static{
        ITEM_MAP.put(1L,new Item(1L,"林延春",100L));
        ITEM_MAP.put(1L,new Item(2L,"林宜春",100L));
        ITEM_MAP.put(1L,new Item(3L,"林雨春",100L));
    }
    @Override
    public Item queryById(Long id) {
        return ITEM_MAP.get(id);
    }
}
