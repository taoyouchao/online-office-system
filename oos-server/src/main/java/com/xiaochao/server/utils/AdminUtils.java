package com.xiaochao.server.utils;

import com.xiaochao.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @program: yeb
 * @description: 操作员工具类
 * @author: 小超
 * @create: 2021-07-15 17:25
 **/
public class AdminUtils {

    /**
     * 获取当前登录操作员
     * @return
     */
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
