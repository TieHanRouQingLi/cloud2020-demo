package com.lhj.springcloud.service.impl;

import com.lhj.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author lhj
 * @Classname MessageProviderImpl
 * @Description
 * @Date 2020/9/8 7:47
 * @Version V1.0
 */

@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {


    @Autowired
    private MessageChannel output;




    @Override
    public String send() {

        String serial = UUID.randomUUID().toString();

        output.send(MessageBuilder.withPayload(serial).build());

        System.out.println("*****serial: " + serial);

        return null;
    }
}
