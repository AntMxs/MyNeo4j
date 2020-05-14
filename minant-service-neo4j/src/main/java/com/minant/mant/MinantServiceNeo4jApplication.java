package com.minant.mant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.minant.mant"})
@MapperScan(basePackages = { "com.minant.mant.mapper"})
public class MinantServiceNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinantServiceNeo4jApplication.class, args);
    }

}
