package com.bdlz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TestSpringcloud07ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud07ConfigClientApplication.class, args);
	}
}
