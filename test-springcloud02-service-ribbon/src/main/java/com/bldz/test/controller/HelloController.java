package com.bldz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bldz.test.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public  String  get(@RequestParam( value = "name")String name){
		String note = helloService.hiService(name);
		System.out.println(note);
		return note;
	}
}
