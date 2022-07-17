package com.tianque;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fades
 * @description
 * @date 2022/7/10 17:28
 */
@SpringBootApplication
@MapperScan("com.tianque.mapper")
public class TestDemo_01Application {

    public static void main(String[] args) {
        SpringApplication.run(TestDemo_01Application.class, args);
    }
}
