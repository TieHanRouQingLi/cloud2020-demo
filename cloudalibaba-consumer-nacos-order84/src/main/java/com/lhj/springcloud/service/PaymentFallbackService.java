package com.lhj.springcloud.service;

import com.lhj.springcloud.entities.CommonResult;
import com.lhj.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author lhj
 * @Classname PaymentFallbackService
 * @Description
 * @Date 2020/9/27 10:24
 * @Version V1.0
 */

@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService",
                new Payment(id, "errorSerial"));
    }
}
