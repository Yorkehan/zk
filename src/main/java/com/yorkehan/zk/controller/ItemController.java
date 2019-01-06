package com.yorkehan.zk.controller;

import com.github.pagehelper.PageInfo;
import com.yorkehan.zk.pojo.Item;
import com.yorkehan.zk.service.ItemService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping("/getItem")
    public Object getItems(Integer page,Integer limit){
        PageInfo<Item> accountMsg = itemService.getItems(page, limit);
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",accountMsg.getTotal());
        map.put("data",accountMsg.getList());
        return map;
    }





}
