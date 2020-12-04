package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@PostMapping("/login2")
	@ResponseBody
	public String login1(@RequestBody Map<String,Object> user){
    	
    	if(user!=null) {
    		if(user.get("username").equals("18077793286")) {
    			return"1";
    		}else {
    			return "0";
    		}
    	}else {
    		System.out.println("用户为空");
    		return "2";	//
    	}
		
	}
	
}
