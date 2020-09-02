package com.lhj.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lhj
 * @Classname PaymentFallbackService
 * @Description
 * @Date 2020/9/2 17:00
 * @Version V1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
