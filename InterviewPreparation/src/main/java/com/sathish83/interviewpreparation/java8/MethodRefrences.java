package com.sathish83.interviewpreparation.java8;

import java.util.ArrayList;
import java.util.List;

import com.sathish83.interviewpreparation.model.Location;

import antlr.StringUtils;

public class MethodRefrences {

	static void testMethod(int x) {
		
		System.out.println("Test called"+x);
	}
	
	void compare(Location l) {
		System.out.println(l.getCountry());
	}
	
	void callLocation() {
		
		List<Location> locationList = new ArrayList<>();
		Location l = new Location();
		l.setCountry("US");
		l.setLocationName("Chicago");
		Location l2 = new Location();
		l2.setCountry("India");
		l2.setLocationName("Bengaluru");
		locationList.add(l);
		locationList.add(l2);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		//static method refernces
		FunctionalInterfaces fi =MethodRefrences::testMethod;
		fi.testMethod(10);
		
		MethodRefrences mr = new MethodRefrences();
		mr.callLocation();
		
	}

}
