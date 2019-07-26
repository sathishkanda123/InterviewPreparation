package com.sathish83.interviewpreparation.programs;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		String s= "s a thish";
		System.out.println("Entered value is");
		String s1= s.replaceAll("\\s", "");
		System.out.println(s1);
	}
}
