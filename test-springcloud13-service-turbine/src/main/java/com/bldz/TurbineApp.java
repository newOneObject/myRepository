package com.bldz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableHystrixDashboard // 使用仪表盘
@EnableHystrix // 启动断路器
@RestController
@EnableTurbine  // 
@SpringBootApplication // springboot标识
public class TurbineApp {

	public static void main(String[] args) {
		SpringApplication.run(TurbineApp.class, args);
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
