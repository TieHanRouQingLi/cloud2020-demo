package com.lhj.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 模拟ribbon的负载均衡器
 * @author lhj
 * @Classname LoadBalancer
 * @Description
 * @Date 2020/9/1 14:00
 * @Version V1.0
 */
public interface LoadBalancer {


    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
