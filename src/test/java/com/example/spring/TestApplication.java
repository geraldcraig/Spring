package com.example.spring;

import org.springframework.boot.SpringApplication;

public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.from(AccessingDataJpaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
