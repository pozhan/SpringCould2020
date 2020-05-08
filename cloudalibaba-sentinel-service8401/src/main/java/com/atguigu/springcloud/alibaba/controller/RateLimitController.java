package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.alibaba.myhandler.CustomerBlockHandler;
import com.atguigu.springcloud.entitys.CommentResult;
import com.atguigu.springcloud.entitys.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/7 22:16
 * @Version 1.0
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommentResult byResource() {
        return new CommentResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }
    public CommentResult handleException(BlockException exception) {
        return new CommentResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommentResult byUrl() {
        return new CommentResult(200,"按url限流测试OK",new Payment(2020L,"serial002"));
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommentResult customerBlockHandler() {
        return new CommentResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }
}
