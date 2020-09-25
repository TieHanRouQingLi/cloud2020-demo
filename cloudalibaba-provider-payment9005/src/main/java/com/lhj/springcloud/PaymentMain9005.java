package com.lhj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lhj
 * @Classname PaymentMain9005
 * @Description
 * @Date 2020/9/25 16:02
 * @Version V1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9005.class, args);
    }
}
