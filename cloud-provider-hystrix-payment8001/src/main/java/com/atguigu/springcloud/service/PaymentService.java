package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author zhangchuxiong
 * @Date 2020/4/28 22:16
 * @Version 1.0
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
