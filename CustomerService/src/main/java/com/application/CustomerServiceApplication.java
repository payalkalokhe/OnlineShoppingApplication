package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.EnableKafka;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableEurekaClient
@SpringBootApplication
@EnableKafka
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
}
