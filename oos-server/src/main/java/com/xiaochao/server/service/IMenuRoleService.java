package com.xiaochao.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochao.server.pojo.MenuRole;
import com.xiaochao.server.response.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaochao
 * @since 2021-06-15
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
