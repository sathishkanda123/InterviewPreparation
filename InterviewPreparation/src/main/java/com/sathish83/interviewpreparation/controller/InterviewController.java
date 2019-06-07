package com.sathish83.interviewpreparation.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterviewController {

	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        return "index";
    }
     
    @RequestMapping("/microservices")
    public String ms() {
        return "microservices";
    }

    @RequestMapping("/m-designpatterns")
    public String md() {
        return "m-designpatterns";
    }
    
    @RequestMapping("/apigateway")
    public String ag() {
        return "apigateway";
    }
    
    @RequestMapping("/oo-designpattern")
    public String ooDesignPattern() {
        return "oo-designpattern";
    }

    @RequestMapping("/facade")
    public String fe() {
        return "facade";
    }
    
    @RequestMapping("/observer")
    public String or() {
        return "observer";
    }

    @RequestMapping("/singleton")
    public String st() {
        return "singleton";
    }

    @RequestMapping("/mvc")
    public String mvc() {
        return "mvc";
    }

    @RequestMapping("/strategy")
    public String sgy() {
        return "strategy";
    }

    @RequestMapping("/flyweight")
    public String fwt() {
        return "flyweight";
    }

    @RequestMapping("/objectpool")
    public String opl() {
        return "objectpool";
    }

    @RequestMapping("/chainofresponsibility")
    public String cor() {
        return "chainofresponsibility";
    }

    @RequestMapping("/angular")
    public String angular() {
        return "angular";
    }

}
