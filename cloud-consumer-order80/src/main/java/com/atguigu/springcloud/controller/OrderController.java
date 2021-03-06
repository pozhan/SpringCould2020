package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entitys.CommentResult;
import com.atguigu.springcloud.entitys.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author zhangchuxiong
 * @Date 2020/4/23 10:32
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL="http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommentResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment, CommentResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommentResult.class);
    }

}
