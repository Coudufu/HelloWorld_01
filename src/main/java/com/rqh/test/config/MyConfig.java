package com.rqh.test.config;


import com.rqh.test.moudle.Car;
import com.rqh.test.moudle.Pet;
import com.rqh.test.moudle.User;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean
    public User user(){
        return new User("小脏");
    }

//    @Bean
//    public Pet pet(){
//        return new Pet("tomcat");
//    }
}
