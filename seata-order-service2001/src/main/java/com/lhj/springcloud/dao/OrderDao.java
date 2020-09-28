package com.lhj.springcloud.dao;

import com.lhj.springcloud.domail.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lhj
 * @Classname OrderDao
 * @Description
 * @Date 2020/9/28 15:35
 * @Version V1.0
 */

@Mapper
public interface OrderDao {

    /**
     * 新建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态，从零改为1
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
