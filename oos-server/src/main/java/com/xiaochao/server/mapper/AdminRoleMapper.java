package com.xiaochao.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochao.server.pojo.AdminRole;
import com.xiaochao.server.response.RespBean;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaochao
 * @since 2021-06-15
 */
@Repository
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer addAdminRole(Integer adminId, Integer[] rids);
}
