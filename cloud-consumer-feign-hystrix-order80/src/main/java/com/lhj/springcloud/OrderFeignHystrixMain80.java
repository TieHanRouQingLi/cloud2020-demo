package com.lhj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lhj
 * @Classname OrderFeignHystrixMain80
 * @Description
 * @Date 2020/9/2 14:47
 * @Version V1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderFeignHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixMain80.class, args);
    }
}
