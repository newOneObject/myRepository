package com.bldz.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pactera on 2017/9/25.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "getHelloInfo", method = RequestMethod.GET)
    public   String  getHelloInfo(@RequestParam(value = "name")String name){
        return  helloService.hiService(name);
    }

}
