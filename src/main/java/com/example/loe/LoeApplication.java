package com.example.loe;

import com.example.loe.config.DruidDBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DruidDBConfig.class)
public class LoeApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoeApplication.class, args);
    }

}
