package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entitys.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author zhangchuxiong
 * @Date 2020/4/22 21:12
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public abstract int create(Payment payment);

    public abstract Payment getPaymentById(@Param("id") Long id);
}
