package com.yhk.mybatisplus2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.yhk.mybatisplus2.core.mapper")
@ComponentScan(basePackages = "com.yhk.mybatisplus2")
public class MybatisPlus2Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus2Application.class, args);
    }

}
