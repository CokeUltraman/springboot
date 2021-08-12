package com.itcast.config;

import com.itcast.interceptor.MyInterveptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //注册拦截器
    @Bean
    public MyInterveptor myInterveptor(){
        return new MyInterveptor();
    }
    //添加拦截器到spring mvc拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterveptor()).addPathPatterns("/*");
    }
}
