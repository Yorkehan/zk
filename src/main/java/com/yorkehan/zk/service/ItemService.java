package com.yorkehan.zk.service;

import com.github.pagehelper.PageInfo;
import com.yorkehan.zk.pojo.Item;

import java.util.List;
import java.util.Map;

public interface ItemService {
    PageInfo<Item> getItems(Integer page, Integer rows);
}
