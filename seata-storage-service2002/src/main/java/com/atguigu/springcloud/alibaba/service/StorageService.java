package com.atguigu.springcloud.alibaba.service;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/10 10:55
 * @Version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
