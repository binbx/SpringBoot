package com.binbx.boot.controller;

import com.binbx.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: HelloController
 * @Author: bxie
 * @Date: 2022/3/8
 */
//@ResponseBody
//@Controller

@Slf4j
@RestController //代替了@ResponseBody与@Controller两个注解
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){

        log.info("请求进来了....");
        return "Hello, Spring Boot 2!"+"你好："+name;
    }

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

}
