package com.buendia.springboot_blackbooks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.buendia.springboot_blackbooks.books.dao")
public class SpringbootBlackbooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBlackbooksApplication.class, args);
    }

}
