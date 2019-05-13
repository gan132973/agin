package com.gkq.agin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gkq.agin.mapper")
public class AginApplication {

    public static void main(String[] args) {
        SpringApplication.run(AginApplication.class, args);
    }

}
