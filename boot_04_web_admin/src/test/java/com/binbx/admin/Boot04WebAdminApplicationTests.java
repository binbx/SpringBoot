package com.binbx.admin;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Arrays;

@Slf4j
@SpringBootTest
class Boot04WebAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {

//        jdbcTemplate.queryForObject("select * from account")
//        jdbcTemplate.queryForList("select * from account",)
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        log.info("记录总数：{}",aLong);

        log.info("数据源类型：{}",dataSource.getClass());
    }



}
