package com.sathish83.interviewpreparation.designpatterns.creational;

/*
 * what ever the products you required you ordered separtly
 */
public class FactoryDesignPatternTest {
	

	public static void main(String[] args) {
		
		MobileFactory hf = new HuaweiFactory();
		hf.buildProduct();
		MobileFactory af = new AppleFactory();
		af.buildProduct();
	}

}
