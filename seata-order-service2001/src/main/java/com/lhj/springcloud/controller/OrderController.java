package com.lhj.springcloud.controller;

import com.lhj.springcloud.domail.Order;
import com.lhj.springcloud.entities.CommonResult;
import com.lhj.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lhj
 * @Classname OrderController
 * @Description
 * @Date 2020/9/28 16:00
 * @Version V1.0
 */

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
