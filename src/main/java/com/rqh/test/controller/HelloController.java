package com.rqh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        System.out.println("hot-fix的内容");
        return "Hello springBoot !";
    }
}
