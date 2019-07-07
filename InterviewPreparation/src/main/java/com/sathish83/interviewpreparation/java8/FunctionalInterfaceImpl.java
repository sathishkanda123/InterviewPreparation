package com.sathish83.interviewpreparation.java8;

public class FunctionalInterfaceImpl implements FunctionalInterfaces{

	public void testMethod() {
		System.out.println("Set in implementation...");		
	}
	
	@Override
	public void testMethod(int x) {
	
		System.out.println("Test method impl u");
	}
	
	public static void main(String[] args) {
	
		FunctionalInterfaces fii = (int x)->System.out.println("Value is"+2*x);
		fii.testMethod(10);
		FunctionalInterfaces fi = new FunctionalInterfaceImpl();
		fi.testMethod2();
		fi.testMethod3();
	}


}
