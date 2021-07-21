package com.xiaochao.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: yeb
 * @description: 分页公共返回对象
 * @author: 小超
 * @create: 2021-07-19 17:47
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {

    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据list
     */
    private List<?> data;

}
