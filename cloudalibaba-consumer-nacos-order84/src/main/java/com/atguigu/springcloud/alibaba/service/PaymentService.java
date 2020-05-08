package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entitys.CommentResult;
import com.atguigu.springcloud.entitys.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/8 10:27
 * @Version 1.0
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommentResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
