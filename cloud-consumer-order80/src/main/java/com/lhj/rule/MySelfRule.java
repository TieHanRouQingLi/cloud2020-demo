package com.lhj.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhj
 * @Classname MySelfRule
 * @Description
 * @Date 2020/9/1 10:46
 * @Version V1.0
 */

@Configuration
public class MySelfRule {

    /**
     * 定义为随机
     *
     * @return
     */

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }


}
