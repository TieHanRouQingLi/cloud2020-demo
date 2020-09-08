package com.lhj.springcloud.controller;

import com.lhj.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lhj
 * @Classname SendMessageController
 * @Description
 * @Date 2020/9/8 7:51
 * @Version V1.0
 */

@RestController
public class SendMessageController {


    @Resource
    private IMessageProvider iMessageProvider;


    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();
    }
}
