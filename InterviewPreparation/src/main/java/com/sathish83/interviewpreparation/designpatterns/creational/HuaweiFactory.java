package com.sathish83.interviewpreparation.designpatterns.creational;

public class HuaweiFactory extends MobileFactory{

	@Override
	void buildProduct() {
		System.out.println("Huawei will design their own designs");
	}
	
}
