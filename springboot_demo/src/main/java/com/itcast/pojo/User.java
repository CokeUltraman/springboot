package com.itcast.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
//在编译阶段会根据注解自动生成对应的方法；data包含get/set/hashcode/equals/tostring等方法
@Data
@Slf4j
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;



}
