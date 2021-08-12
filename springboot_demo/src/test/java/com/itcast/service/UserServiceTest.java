package com.itcast.service;

import com.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    private UserService userservice;
    @Test
    public void queryById() {
        User user=userservice.queryById(8L);
        System.out.println(user);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setAge(18);
        userservice.saveUser(user);

    }
}