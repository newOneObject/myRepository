package com.bldz.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pactera on 2017/9/7.
 */

@RestController
public class HomeController {
    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    public  String  getHome(@RequestParam("name") String name){
        return  "当前配置端口："+port + " 名称为：" + name;
    }
}
