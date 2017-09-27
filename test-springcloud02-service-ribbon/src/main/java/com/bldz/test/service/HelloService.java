package com.bldz.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by pactera on 2017/9/15.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    
    /*public  String hiService(final String name){
    	for(int  i = 0; i<100;i++){
    		new Thread(new Runnable() {
				public void run() {
					  String result = restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
					  System.out.println(result);
				}
			}).start();
    	}
    		return "";
    }*/
    @HystrixCommand(fallbackMethod="hiError")
    public  String hiService(final String name){
		String result = restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    		return result;
    }
    
    public  String hiError(String name){
    	return "服务异常，熔断器启动：" + name;
    }
}
