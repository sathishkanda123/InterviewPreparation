package com.sathish83.interviewpreparation.java;

public class OverRidingChild extends OverRidingParent{
	
	int a =30;
	
    @Override	
    public void childMethod() {
		
		System.out.println("childmethod in child class");
	}
    
    public static void parentStatic() {
    	
    	System.out.println("child static method..");
    }
    
    public static void main(String[] args) {
		
    	OverRidingParent op = new OverRidingChild();
    	OverRidingChild oc = new OverRidingChild();
    	op.parentMethod();
    	op.childMethod();
    	System.out.println("It will refer parent class"+op.a);
    	System.out.println("It will refer child class"+oc.a);
    	op.parentStatic();
    	
    }
}
