package com.xiaochao.server.exception;

import com.xiaochao.server.response.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @program: yeb
 * @description: 全局异常处理
 * @author: 小超
 * @create: 2021-06-18 15:55
 **/
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLException.class)
    public RespBean mysqlException(SQLException e){

        e.printStackTrace();
        if (e instanceof SQLIntegrityConstraintViolationException){
            return RespBean.error("该数据有关联数据，操作失败");
        }
        
        return RespBean.error("数据库异常，操作失败");
    }

}
