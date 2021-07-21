package com.xiaochao.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochao.server.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaochao
 * @since 2021-06-15
 */
@Repository
public interface DepartmentMapper extends BaseMapper<Department> {


    List<Department> getAllDepartments(Integer parentId);

    void addDep(Department dep);

    void deleteDep(Department dep);
}
