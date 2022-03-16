package com.binbx.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@MapperScan("com.binbx.admin.mapper")
@ServletComponentScan(basePackages = "com.binbx.admin")
@SpringBootApplication(exclude = RedisAutoConfiguration.class)  //测试，禁用掉redis所有自动配置
public class Boot04WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot04WebAdminApplication.class, args);
    }

}
