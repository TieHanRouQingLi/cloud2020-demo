package com.lhj.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhj
 * @Classname MyBatisConfig
 * @Description
 * @Date 2020/9/28 16:01
 * @Version V1.0
 */

@Configuration
@MapperScan({"com.lhj.springcloud.dao"})
public class MyBatisConfig {
}
