package com.lhj.springcloud.lb.impl;

import com.lhj.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lhj
 * @Classname LoadBalancerImpl
 * @Description
 * @Date 2020/9/1 14:01
 * @Version V1.0
 */

@Component
public class LoadBalancerImpl implements LoadBalancer {


    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private final int getAndIncrement() {
        int current;
        int next;
        do {

            current = this.atomicInteger.get();

            next = current >= Integer.MAX_VALUE ? 0 : current + 1;


        } while (!this.atomicInteger.compareAndSet(current, next));


        System.out.println("************访问次数，next=：" + next);
        return next;
    }


    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
