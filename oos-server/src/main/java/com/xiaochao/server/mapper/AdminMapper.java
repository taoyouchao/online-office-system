package com.xiaochao.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochao.server.pojo.Admin;
import com.xiaochao.server.pojo.Menu;
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
public interface AdminMapper extends BaseMapper<Admin> {


    List<Admin> getAllAdmins(Integer id, String keywords);
}
