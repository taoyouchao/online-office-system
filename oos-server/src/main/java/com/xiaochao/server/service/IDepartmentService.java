package com.xiaochao.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochao.server.pojo.Department;
import com.xiaochao.server.response.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaochao
 * @since 2021-06-15
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);

    /**
     * 删除部门
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);
}
