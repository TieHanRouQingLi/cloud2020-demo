package com.lhj.springcloud.controller;

import com.lhj.springcloud.entities.CommonResult;
import com.lhj.springcloud.entities.Payment;
import com.lhj.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lhj
 * @Classname OrderFeignController
 * @Description
 * @Date 2020/9/1 15:27
 * @Version V1.0
 */

@RestController
public class OrderFeignController {


    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }


}
