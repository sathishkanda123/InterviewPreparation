package com.sathish83.interviewpreparation.java8;

public class FunctionalInterfaceImpl implements FunctonalInterfaces{

	@Override
	public void testMethod() {
		System.out.println("Set in implementation...");		
	}
	
	public static void main(String[] args) {
		FunctonalInterfaces fi = new FunctionalInterfaceImpl();
	}

}
