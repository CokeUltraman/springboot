package com.itcast.service;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;



    //根据id查询
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
    //新增保存用户
    @Transactional
    public void saveUser(User user){
        //选择性新增，如果属性为空，则该属性不会出现在insert语句上
        userMapper.insertSelective(user);
    }
}
