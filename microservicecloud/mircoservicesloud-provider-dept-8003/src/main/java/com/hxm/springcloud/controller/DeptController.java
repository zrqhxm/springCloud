package com.hxm.springcloud.controller;

import com.hxm.springcloud.entities.Dept;
import com.hxm.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud.controller
 * @date 2018/12/21
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> get(){
        return deptService.findAll();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }


    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("****"+list);
        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance:instances){
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.client;
    }
}
