package com.hxm.springcloud.service.impl;

import com.hxm.springcloud.dao.DeptDao;
import com.hxm.springcloud.entities.Dept;
import com.hxm.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud.service.impl
 * @date 2018/12/21
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
