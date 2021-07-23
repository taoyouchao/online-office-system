package com.xiaochao.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochao.server.pojo.Employee;
import com.xiaochao.server.pojo.RespPageBean;
import com.xiaochao.server.response.RespBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaochao
 * @since 2021-06-15
 */
public interface IEmployeeService extends IService<Employee> {

    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    RespBean maxWorkId();

    RespBean insertEmployee(Employee employee);

    List<Employee> getEmployee(Integer id);

    RespPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
