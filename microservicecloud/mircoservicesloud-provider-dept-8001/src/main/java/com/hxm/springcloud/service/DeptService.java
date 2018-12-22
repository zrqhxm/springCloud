package com.hxm.springcloud.service;

import com.hxm.springcloud.entities.Dept;

import java.util.List;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud.service
 * @date 2018/12/21
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept get(Long id);

    public List<Dept> findAll();
}
