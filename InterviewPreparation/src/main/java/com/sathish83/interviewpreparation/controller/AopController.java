package com.sathish83.interviewpreparation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathish83.interviewpreparation.service.AopService;

@RestController
@RequestMapping(value="/api/aop")
public class AopController {
	
	private AopService aopService;
	
	@Autowired
	public AopController(AopService aopService) {
	this.aopService=aopService;
	}

	@GetMapping("/test")
	public String testAop() {
	return aopService.testAop();
	}

}
