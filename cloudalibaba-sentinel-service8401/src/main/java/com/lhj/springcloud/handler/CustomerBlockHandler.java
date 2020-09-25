package com.lhj.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lhj.springcloud.entities.CommonResult;

/**
 * @author lhj
 * @Classname CustomerBlockHandler
 * @Description
 * @Date 2020/9/25 11:13
 * @Version V1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler-----------handler1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler-----------handler2");
    }

}
