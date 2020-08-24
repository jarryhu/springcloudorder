package com.hukun;

import org.aspectj.weaver.ast.Or;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hukun.repository")
public class OrderClientdApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderClientdApplication.class, args);

    }
}
