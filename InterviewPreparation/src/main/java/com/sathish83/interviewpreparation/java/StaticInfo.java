package com.sathish83.interviewpreparation.java;

public class StaticInfo {

	
	int a = 20;
	
	static int b = 30;
	
	StaticInfo(){
		System.out.println("Constructor called...");
	}
	
	static void staticMethod() {
		System.out.println("Static method called...");
	}
	
	void normalMethod() {
		b= 49;
		System.out.println("Normal method called.."+b);
	    staticMethod();
	}
	
	static {
		System.out.println("Static block called..");
	}
	
	
	
	public static void main(String[] args) {
		
		StaticInfo si = new StaticInfo();
		StaticInfo si2 = new StaticInfo();
		si.normalMethod();
		si2.a=30;
		si2.b=50;
		System.out.println("A value of first Object"+si.a);
		System.out.println("A value of second Object"+si2.b);
		System.out.println("");
		System.out.println("B value of first static Object"+si.b);
		System.out.println("B value of second static Object"+si2.b);
	}

	
	
}
