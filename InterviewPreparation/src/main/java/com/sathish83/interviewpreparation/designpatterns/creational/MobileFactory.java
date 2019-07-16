package com.sathish83.interviewpreparation.designpatterns.creational;

abstract public class MobileFactory {

	/*
	 * Epquipments are provided by main factory
	 */
	void provideEpquipments() {
		
		System.out.println("All parts are given");
	}
	
	abstract void buildProduct();
	
}
