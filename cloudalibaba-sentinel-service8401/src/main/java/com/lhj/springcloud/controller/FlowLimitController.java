package com.lhj.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhj
 * @Classname FlowLimitController
 * @Description
 * @Date 2020/9/23 13:37
 * @Version V1.0
 */

@RestController
public class FlowLimitController {



    @GetMapping("/testA")
    public String testA(){
        return "----------------testA";
    }



    @GetMapping("/testB")
    public String testB(){
        return "----------------testB";
    }
}
