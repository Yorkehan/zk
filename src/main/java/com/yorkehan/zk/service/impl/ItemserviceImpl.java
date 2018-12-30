package com.yorkehan.zk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yorkehan.zk.mapper.ItemMapper;
import com.yorkehan.zk.pojo.Item;
import com.yorkehan.zk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemserviceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Override
    public PageInfo<Item> getItems(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<Item> list=itemMapper.selectAll();
        return new PageInfo<Item>(list);
    }
}
