package com.lhj.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lhj
 * @Classname StorageDao
 * @Description
 * @Date 2020/9/28 16:45
 * @Version V1.0
 */

@Mapper
public interface StorageDao {


    /**
     * 扣减库存信息
     *
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
