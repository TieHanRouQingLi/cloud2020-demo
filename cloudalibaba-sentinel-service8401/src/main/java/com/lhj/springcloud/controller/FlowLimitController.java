package com.lhj.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author lhj
 * @Classname FlowLimitController
 * @Description
 * @Date 2020/9/23 13:37
 * @Version V1.0
 */

@RestController
@Slf4j
public class FlowLimitController {


    @GetMapping("/testA")
    @SentinelResource(value = "testA")
    public String testA() {

        log.info(Thread.currentThread().getName() + "...testA");
        return "----------------testA";
    }


    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "...testB");
        return "----------------testB";
    }


    @GetMapping("/testD")
    public String testD()
    {
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");

        return "------testD";
    }




    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        //int age = 10/0;
        return "------testHotKey";
    }

    //兜底方法
    public String deal_testHotKey (String p1, String p2, BlockException exception){
        return "------deal_testHotKey,o(╥﹏╥)o";
    }



}
