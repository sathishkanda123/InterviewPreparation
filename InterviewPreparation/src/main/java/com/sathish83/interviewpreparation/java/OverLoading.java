package com.sathish83.interviewpreparation.java;

public class OverLoading {

	void sum() {
		System.out.println("No Praameters");
	}
	
	void sum(int a){
		System.out.println("Single int parameter");
	}
	
	void sum(float a) {
		
		System.out.println("Single float parameter");
		
	}
	
	void sum(long a) {
		
		System.out.println("Single long parameter");
	}
	
	
	public static void main(String[] args) {
		
		OverLoading ol = new OverLoading();
		ol.sum(10);
	}
}
