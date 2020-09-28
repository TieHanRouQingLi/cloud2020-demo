package com.lhj.springcloud.service;

/**
 * @author lhj
 * @Classname StorageService
 * @Description
 * @Date 2020/9/28 16:47
 * @Version V1.0
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);

}
