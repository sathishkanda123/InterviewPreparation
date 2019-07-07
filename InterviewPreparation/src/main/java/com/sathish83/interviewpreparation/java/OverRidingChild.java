package com.sathish83.interviewpreparation.java;

public class OverRidingChild extends OverRidingParent{
	
    @Override	
    public void childMethod() {
		
		System.out.println("childmethod in child class");
	}
    
    public static void parentStatic() {
    	
    	System.out.println("child static method..");
    }
    
    public static void main(String[] args) {
		
    	OverRidingParent op = new OverRidingChild();
    	op.parentMethod();
    	op.childMethod();
    	op.parentStatic();

    }
}
