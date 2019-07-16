package com.sathish83.interviewpreparation.designpatterns.creational;

/*
 * This is the simplest approach wherein the instance of the class is created at the time of class loading -
 */
public class EagerlyInitilizedSingleTon {
	
	private static final EagerlyInitilizedSingleTon eist = new EagerlyInitilizedSingleTon();
	
	private EagerlyInitilizedSingleTon() {
		System.out.println("Private constructor");
	}
	
	public static EagerlyInitilizedSingleTon getInitializedSingleTon() {
		return eist;
	}
	
	public static void main(String[] args) {
		
	}
}
