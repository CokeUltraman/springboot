package com.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot工程都有一个启动引导类，这是工程的入口类，并在引导类上添加这个组合注解springbootapplication
@SpringBootApplication
//扫描mybatis所有的业务mapper接口
@MapperScan("com.itcast.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}