package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/4 10:47
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${datasource.username}")
    private String userName;

    @GetMapping("/userName")
    public String getUserName() {
        return "serverPort: " + serverPort + "\t\n\n configInfo: " + userName;
    }
}
