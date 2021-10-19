package com.atguigu.admin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.awt.*;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        jdbcTemplate.queryForList("select * from myguests");
        //Long aLong =jdbcTemplate.queryForObject("select count (*) from myguests",long.class);
        //Long aa=jdbcTemplate.queryForObject("select count * from myguests",long.class);
        //log.info("记录总数：{}",aa);
    }

}
