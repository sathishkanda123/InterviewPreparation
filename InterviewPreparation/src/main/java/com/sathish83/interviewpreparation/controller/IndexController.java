package com.sathish83.interviewpreparation.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        return "index";
    }
     
    @RequestMapping("/microservices")
    public String microservices() {
        return "microservices";
    }

    @RequestMapping("/m-designpatterns")
    public String md() {
        return "m-designpatterns";
    }
    
    @RequestMapping("/eventdriven")
    public String ed() {
        return "eventdriven";
    }



    
}
