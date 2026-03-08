package com.example.spring;

import org.springframework.boot.SpringApplication;

public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.from(RelationalDataAccessApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
