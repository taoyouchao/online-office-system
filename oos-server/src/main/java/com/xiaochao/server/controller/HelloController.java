package com.xiaochao.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: yeb
 * @description: 测试用的controller
 * @author: 小超
 * @create: 2021-06-18 10:40
 **/
@RestController
public class HelloController {

    @GetMapping("/employee/basic/hello")
    public String hello2(){
        return "/employee/basic/**";
    }
    @GetMapping("/employee/advanced/hello")
    public String hello3(){
        return "/employee/advanced/hello";
    }
}
