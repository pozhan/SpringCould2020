package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entitys.CommentResult;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/7 22:39
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommentResult handlerException(BlockException exception) {
        return new CommentResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommentResult handlerException2(BlockException exception) {
        return new CommentResult(4444,"按客戶自定义,global handlerException----2");
    }
}
