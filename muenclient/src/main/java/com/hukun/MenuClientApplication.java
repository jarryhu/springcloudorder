package com.hukun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hukun.repository")
public class MenuClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuClientApplication.class,args);
    }
}
