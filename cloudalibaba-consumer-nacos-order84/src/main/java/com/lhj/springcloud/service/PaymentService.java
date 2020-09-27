package com.lhj.springcloud.service;

import com.lhj.springcloud.entities.CommonResult;
import com.lhj.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lhj
 * @Classname PaymentService
 * @Description
 * @Date 2020/9/27 10:22
 * @Version V1.0
 */

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
