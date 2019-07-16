package com.sathish83.interviewpreparation.designpatterns.creational;

public class AppleFactory extends MobileFactory {

	@Override
	void buildProduct() {
		System.out.println("Apple Designs Their own way");
	}
	
}
