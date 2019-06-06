package com.sathish83.interviewpreparation.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }
     
    @RequestMapping("/microservices")
    public String microservices(Map<String, Object> model) {
        return "microservices";
    }
	
}
