package com.lhj.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author lhj
 * @Classname PaymentService
 * @Description
 * @Date 2020/9/2 11:48
 * @Version V1.0
 */

@Service
public class PaymentService {


    public String paymentInfoOk(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + " paymentInfoOK,id: " + id + "\t" + "哈哈哈";
    }


    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfoTimeOut(Integer id) {

        long timeNumber = 2;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfoTimeOut,id: " + id + "\t" + "呜呜呜， 耗时：（秒）";
    }

    /**
     * 兜底的方法（服务降级）
     * @param id
     * @return
     */
    public String paymentInfoTimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   系统繁忙, 请稍候再试  ,id：  " + id + "\t" + "哭了哇呜";
    }
}
