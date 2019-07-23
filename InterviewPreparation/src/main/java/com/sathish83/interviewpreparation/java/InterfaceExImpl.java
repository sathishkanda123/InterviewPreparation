package com.sathish83.interviewpreparation.java;

public class InterfaceExImpl implements InterfaceEx{

	int a = 30;
	
	@Override
	public void example() {
  	System.out.println(a);
	}
	
	public static void main(String[] args) {
		InterfaceEx iei = new InterfaceExImpl();
		iei.example();
	}
	
	

}
