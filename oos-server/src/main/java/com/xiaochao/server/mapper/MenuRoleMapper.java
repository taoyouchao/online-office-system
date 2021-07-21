package com.xiaochao.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochao.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaochao
 * @since 2021-06-15
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    Integer insertRecord(@Param("rid") Integer rid,@Param("mids") Integer[] mids);
}
