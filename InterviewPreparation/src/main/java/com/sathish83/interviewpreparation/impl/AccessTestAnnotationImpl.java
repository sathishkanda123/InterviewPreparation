package com.sathish83.interviewpreparation.impl;

import java.lang.reflect.Method;

import com.sathish83.interviewpreparation.annotations.TestAnnotation;
import com.sathish83.interviewpreparation.model.JobSeeker;

public class AccessTestAnnotationImpl {


	public static void main(String[] args) {
		
		
		   //class level annotation
     		
		    Class<?> js1 =JobSeeker.class;
     		
     		if(js1.isAnnotationPresent(TestAnnotation.class)) {
     			
     		TestAnnotation ta= js1.getAnnotation(TestAnnotation.class);

     		System.out.println(ta!=null?ta.author():"Not Found");
     			
     		}else {
     			System.out.println("No annotation at class level");
     		}
     		
     		//method level access
     		
     		JobSeeker js = new JobSeeker();
     		
     		Method[] methods = js.getClass().getMethods();
			for(Method m :methods) {
				TestAnnotation ta = m.getAnnotation(TestAnnotation.class);
				System.out.println(ta!=null?"Author name is"+ta.author():"Annotation Not specied in method -- "+m.getName());
			}
	}
}
