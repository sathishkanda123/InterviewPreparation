package com.sathish83.interviewpreparation.java;

/*
 * String is a Class in java and defined in java.lang package. It’s not a primitive data type like int and long.
 */
public class StringQuestions {

	
	public static void main(String[] args) {
	
		String s= "InterviewPreparation";
		
		//GE Question
		//char var;
		
		//var = "hackathons".charAt(-1);
		//System.out.println("var is "+var);
		// Index out of bound exception
		
		System.out.println("Get the value from particualr Index--"+s.charAt(19));
		
		System.out.println("Get the length of the string--"+s.length());
		
		System.out.println("Get the Substring of the string--"+s.substring(1));
		
		System.out.println("Get the Substring of the string--"+s.substring(3, 6));
		
		System.out.println("Contains--"+s.contains("Int"));
		
		System.out.println("Join Method--"+String.join("###", "Interview Preparation","Sathish83"));
	
	 // String buffer
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println("String BUffer Reverse"+sb.reverse());
	
	// string builder
		
		StringBuilder sbu= new StringBuilder(s);
		
		System.out.println("String builder revers"+sbu.reverse());

		String reverse="";
		
		for(int i = s.length()-1;i>=0;i--) {
			
           reverse = reverse+ s.charAt(i);
			
		}
		
		System.out.println("FInal reverse using String"+reverse);
		
	}
	
	
}
