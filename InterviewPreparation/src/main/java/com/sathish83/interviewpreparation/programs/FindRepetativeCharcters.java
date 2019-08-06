package com.sathish83.interviewpreparation.programs;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * "DBCABA" - B - FIRST REPATIVE CHARCTER
 * 
 */
public class FindRepetativeCharcters {


	private static void testRepeatative(String s) {
		
		Set<Character> mapCharcters = new LinkedHashSet<>();
		
		for(char ch:s.toCharArray()) {
			if(mapCharcters.contains(ch)) {
				System.out.println("Repeative first charcter is "+ch);
				break;
			}
			else {mapCharcters.add(ch);}	
		}
		
		
	}
	
	public static void main(String[] args) {
	
	 while(true){
		 Scanner sc = new Scanner(System.in);
		 try {
	     System.out.println("Enter the string you want to search");
	     if(sc.hasNext()) {
	    	 StringBuilder sb = new StringBuilder(sc.nextLine());
	    	 testRepeatative(sb.toString());
	     }
		 }finally {
		sc.close();
	 }
	 }

	}
}
	

	
