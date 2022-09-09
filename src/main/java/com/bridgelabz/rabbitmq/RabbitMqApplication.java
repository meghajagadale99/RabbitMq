package com.bridgelabz.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to RabbitMq Project");
        SpringApplication.run(RabbitMqApplication.class, args);
    }

}
