package com.itcast.controller;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @GetMapping("hello")
    public String hello(){
        System.out.println(dataSource);
        return "hello , spring-boot!!";
    }

    @Autowired
    private UserService userService;

    //根据用户Id去查询用户
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
}
