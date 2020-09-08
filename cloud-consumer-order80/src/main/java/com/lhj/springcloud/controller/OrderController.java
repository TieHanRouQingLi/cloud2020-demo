package com.lhj.springcloud.controller;

import com.lhj.springcloud.entities.CommonResult;
import com.lhj.springcloud.entities.Payment;
import com.lhj.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;


    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment2/get/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> responseEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        return responseEntity.getBody();
    }

    @GetMapping("/consumer/payment/lb")
    public String getPayment3() {


        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        ServiceInstance serviceInstance = loadBalancer.instances(serviceInstances);
        URI uri = serviceInstance.getUri();

        return restTemplate.getForObject(uri + "/payment/lb/", String.class);
    }

    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin() {
        String result = restTemplate.getForObject("http://localhost:8001" + "/payment/zipkin/", String.class);
        return result;
    }

}
