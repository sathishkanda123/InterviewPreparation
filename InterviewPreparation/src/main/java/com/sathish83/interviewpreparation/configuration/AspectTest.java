package com.sathish83.interviewpreparation.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectTest {

	@Before("execution(* com.sathish83.interviewpreparation.service.AopService.*.*(..))")
	public void before(JoinPoint joinPoint){
		//Advice
		System.out.println("Called before aop service call"+joinPoint);
	}
	
	
}
