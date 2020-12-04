package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller1 {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello1(){
        return "hello1";
    }
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String hello2(){
        return "hello2";
    }
}

