package com.sathish83.interviewpreparation.java;

import java.io.FileNotFoundException;

import net.bytebuddy.matcher.StringMatcher;

public class GCQuestions {

	
	public static void main(String[] args) {
		
		int var1=-4;
		System.out.println(var1>>2);
		int var2=4;
		System.out.println(var2>>1);
		
		String regex=".@.";
		GCQuestions.compare("Hacker@Earth.com",regex);
		GCQuestions.compare("a@N",regex);
		GCQuestions.compare("Java@Program",regex);
		
		
		
				
		
	}

	private static void compare(String string, String regex) {
		
		if(string.matches(regex)) {
			
			System.out.println(string+"matches");
		}else {
			
			System.out.println(string+"@@@not matches");
		}
		
		
	}
}
