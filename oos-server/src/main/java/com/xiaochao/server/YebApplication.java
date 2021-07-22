package com.xiaochao.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: yeb
 * @description: 启动类
 * @author: 小超
 * @create: 2021-06-15 12:48
 **/
@SpringBootApplication
@MapperScan("com.xiaochao.server.mapper")
@EnableScheduling//开启定时任务
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class,args);
    }
}
