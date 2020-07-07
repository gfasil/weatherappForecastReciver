package com.gfasil.rabbitmq.weatherappforecastreceiverservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class WeatherappforecastreceiverserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherappforecastreceiverserviceApplication.class, args);
    }

}