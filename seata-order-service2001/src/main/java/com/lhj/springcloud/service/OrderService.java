package com.lhj.springcloud.service;

import com.lhj.springcloud.domail.Order;

/**
 * @author lhj
 * @Classname OrderService
 * @Description
 * @Date 2020/9/28 15:43
 * @Version V1.0
 */
public interface OrderService{
    void create(Order order);
}
