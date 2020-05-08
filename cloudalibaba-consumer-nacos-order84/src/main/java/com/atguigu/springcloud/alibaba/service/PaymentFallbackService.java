package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entitys.CommentResult;
import com.atguigu.springcloud.entitys.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/8 10:28
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommentResult<Payment> paymentSQL(Long id) {
        return new CommentResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
