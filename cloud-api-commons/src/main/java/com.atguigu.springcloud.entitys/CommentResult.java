package com.atguigu.springcloud.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zhangchuxiong
 * @Date 2020/4/22 18:43
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult<T> {
    private Integer     code;
    private String      message;
    private T           data;

    public CommentResult(Integer code, String message){
        this(code, message,null);
    }
}
