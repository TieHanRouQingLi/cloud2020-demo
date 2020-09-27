package com.lhj.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lhj.springcloud.entities.CommonResult;
import com.lhj.springcloud.entities.Payment;
import com.lhj.springcloud.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhj
 * @Classname RateLimitController
 * @Description
 * @Date 2020/9/25 11:15
 * @Version V1.0
 */

@RestController
public class RateLimitController {




    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl()
    {
        return new CommonResult(200,"按url限流测试OK",new Payment(2020L,"serial002"));
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handleException2")
    public CommonResult customerBlockHandler()
    {
        return new CommonResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }

}
