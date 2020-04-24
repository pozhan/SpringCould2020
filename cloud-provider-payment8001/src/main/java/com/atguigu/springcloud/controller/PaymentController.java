package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entitys.CommentResult;
import com.atguigu.springcloud.entitys.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author zhangchuxiong
 * @Date 2020/4/22 21:41
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommentResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);

        if (result>0){
            return new CommentResult(200,"插入数据库成功",result);
        }else{
            return new CommentResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果：" + payment + "\t" + "haha");

        if (payment != null){
            return new CommentResult(200,"查询成功", payment);
        }else{
            return new CommentResult(444,"没有对应记录,查询ID: " + id,null);
        }
    }
}
