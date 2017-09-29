package com.bldz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 开启配置文件服务
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class TestSpringcloud07ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringcloud07ConfigServerApplication.class, args);
	}
}
