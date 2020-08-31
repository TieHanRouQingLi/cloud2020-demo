package com.lhj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lhj
 * @Classname PaymentMain8004
 * @Description
 * @Date 2020/8/31 16:46
 * @Version V1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
