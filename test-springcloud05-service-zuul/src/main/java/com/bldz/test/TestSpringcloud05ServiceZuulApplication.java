package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class TestSpringcloud05ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud05ServiceZuulApplication.class, args);
	}
}
