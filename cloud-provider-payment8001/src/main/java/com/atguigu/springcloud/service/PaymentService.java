package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entitys.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author zhangchuxiong
 * @Date 2020/4/22 21:36
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
