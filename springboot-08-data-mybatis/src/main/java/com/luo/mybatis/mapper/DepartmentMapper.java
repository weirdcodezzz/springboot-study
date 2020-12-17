package com.luo.mybatis.mapper;

import com.luo.mybatis.pojo.Department;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author luo Fuqiang
 * @date 2020/12/17 14:59
 */
public interface DepartmentMapper extends Mapper<Department> {

    /**
     * 通过部门名称查询
     * @param name
     * @return
     */
    Department selectByName(String name);
}
