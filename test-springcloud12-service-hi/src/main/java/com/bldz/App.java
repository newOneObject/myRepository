package com.bldz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableHystrix //启动断路器
@EnableHystrixDashboard //启动仪表盘
@RestController
@EnableEurekaClient //Eureka-client
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	
	@Value(value="${server.port}")
	private String port;
	
	@RequestMapping(value="/hi")
	@HystrixCommand(fallbackMethod="error")//服务断开调用方法
	public  String hi(@RequestParam String name){
		return "hi " + name + "i  am  port is " + port;
	}
	
	public String error(String name){
		return "hi , " + name + ", sorry  error!" ;
	}
}
