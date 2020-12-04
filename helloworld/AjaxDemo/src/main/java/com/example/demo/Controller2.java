package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller2 {
    @RequestMapping(value = "/getJson")
    @ResponseBody
    public String getJson () {
        
        String jsonStr = "{\"code\":0,\"msg\":\"成功\"}";
        System.out.println(jsonStr);
        return jsonStr;
    }
    @GetMapping("/test1")
	@ResponseBody
	public String test1(String username,String password){
    	System.out.println(username);
		System.out.println(password);
		return "1";
	}
    @PostMapping("/test2")
	@ResponseBody
	public String test2(@RequestBody String username,String password){
    	System.out.println(username);
		System.out.println(password);
		return "1";
	}
}
