package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zhangchuxiong
 * @Date 2020/5/9 23:35
 * @Version 1.0
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId")Long productId, @Param("count")Integer count);
}
