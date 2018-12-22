package com.hxm.springcloud.dao;

import com.hxm.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud.dao
 * @date 2018/12/21
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
