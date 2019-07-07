package com.sathish83.interviewpreparation.controller;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathish83.interviewpreparation.service.InterviewService;

@Controller
public class InterviewController implements InitializingBean , DisposableBean{ 

	InterviewService interviewService;
	
	
	
	@Autowired
	public InterviewController(InterviewService interviewService) {
		this.interviewService = interviewService;
	}
	

	@Autowired
	public void setInterviewService() {
		
	}
	
	
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
	
	@RequestMapping("/collections")
	public String collections() {
		return "collections";
	}
	
	@RequestMapping("/others_java")
	public String oj() {
		return "others_java";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Proeprties set");
	}


}
