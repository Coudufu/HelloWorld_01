package com.rqh.test;

import com.rqh.test.config.MyConfig;
import com.rqh.test.moudle.Car;
import com.rqh.test.moudle.Pet;
import com.rqh.test.moudle.User;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext run=SpringApplication.run(Main.class,args);
        Pet bean1 = run.getBean(Pet.class);
        System.out.println(bean1);
        System.out.println("版本2添加的新功能");
        System.out.println("master分支添加的内容");
        System.out.println("代码冲突master");
        System.out.println("代码冲突hot-fix");
        System.out.println("push测试");
        System.out.println("pull测试");
    }
}
