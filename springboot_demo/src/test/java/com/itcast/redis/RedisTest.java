package com.itcast.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){
        //String
        redisTemplate.opsForValue().set("str","heima");
        //redisTemplate.boundValueOps("str").set("heima");//与上述写法一致
        System.out.println(redisTemplate.opsForValue().get("str"));
        //hash
        redisTemplate.boundHashOps("h_key").put("name","heima");
        redisTemplate.boundHashOps("h_key").put("age",18);
        //获取所有域
        Set set = redisTemplate.boundHashOps("h_key").keys();
        System.out.println(set);
        //获取所有值
        List list = redisTemplate.boundHashOps("h_key").values();
        System.out.println(list);


        //list
        redisTemplate.boundListOps("l_key").leftPush("c");
        redisTemplate.boundListOps("l_key").leftPush("b");
        redisTemplate.boundListOps("l_key").leftPush("a");
        //获取全部元素
        List list2 = redisTemplate.boundListOps("l_key").range(0, -1);
        System.out.println(list2);


        //set
        redisTemplate.boundSetOps("s_key").add("a","b","c");
        set=redisTemplate.boundSetOps("s_key").members();
        System.out.println(set);

        //sortedset
        redisTemplate.boundZSetOps("z_key").add("a",30);
        redisTemplate.boundZSetOps("z_key").add("b",20);
        redisTemplate.boundZSetOps("z_key").add("c",10);
        set=redisTemplate.boundZSetOps("z _key").range(0,-1);
        System.out.println(set);

    }
}
