package com.sathish83.interviewpreparation.java8;

@FunctionalInterface
public interface FunctionalInterfaces {
	
	void testMethod(int x) ;
	
    default void testMethod2() {
		   System.out.println("Hai am default/static method..");
	}
    
    default void testMethod3() {
    	System.out.println("Hai am default 2md method");
    }
}

