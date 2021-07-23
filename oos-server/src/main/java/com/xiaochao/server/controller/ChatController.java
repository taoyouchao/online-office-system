package com.xiaochao.server.controller;

import com.xiaochao.server.pojo.Admin;
import com.xiaochao.server.service.IAdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: oos
 * @description: 在线聊天
 * @author: 小超
 * @create: 2021-07-23 11:26
 **/
@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private IAdminService adminService;
    @ApiOperation(value = "获取所有操作员")
    @GetMapping("/")
    public List<Admin> getAllAdmins(String keywords){
        return adminService.getAllAdmins(keywords);
    }

}
