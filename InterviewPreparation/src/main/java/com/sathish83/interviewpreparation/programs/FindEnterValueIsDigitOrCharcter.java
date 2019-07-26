package com.sathish83.interviewpreparation.programs;

import java.util.Scanner;

public class FindEnterValueIsDigitOrCharcter {

	public static void main(String[] args) {
		
		char c = 'A';
		  System.out.println((int)c);
				 
			System.out.println("Enter the value");
			try(Scanner sc = new Scanner(System.in)){
			char value = sc.next().toCharArray()[0];
		    if(value>='a' && value<='z') {
		    	System.out.println("Smallvalues");
		    }else  
		    if(value>='A' && value<='Z') {
		    	System.out.println("greater values");
		    }else 
		    if(value>='0' && value<='9') {
		    	System.out.println("is a number");
		    	System.out.println(Character.getNumericValue(value));
		    }
		}
			

	}
}
