package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TestSpringcloud08ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud08ConfigClientApplication.class, args);
	}
}
