package com.sathish83.interviewpreparation.java8;

@FunctionalInterface
public interface FunctonalInterfaces {
	
	void testMethod(int x) ;
	
    default void testMethod2() {
		   System.out.println("Hai am default/static method..");
	}
}

