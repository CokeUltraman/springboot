package com.itcast.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
//在编译阶段会根据注解自动生成对应的方法；data包含get/set/hashcode/equals/tostring等方法
@Data
@Table(name="tb_user")
public class User {
    @Id
    //主键回填
    @KeySql(useGeneratedKeys = true)
    private Long id;

    //@Column(name="userName")
    //user_name---->userName
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
