package com.sathish83.interviewpreparation.java;

public class OverRidingParent {

	int a =10;
	
	public void parentMethod() {
		
		System.out.println("Parentmethod");
	}
	
	protected static void parentStatic() {
		
		System.out.println("Parent static method..");
	}
	
	public void childMethod() {
		
		System.out.println("childmethod in parent class");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Supper class method");
	}
}
