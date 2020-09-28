package com.lhj.springcloud.domail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author lhj
 * @Classname Order
 * @Description
 * @Date 2020/9/28 15:33
 * @Version V1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;


    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;
}