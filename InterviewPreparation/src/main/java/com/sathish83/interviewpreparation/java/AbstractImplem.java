package com.sathish83.interviewpreparation.java;

public abstract class AbstractImplem {

	abstract void temp();
	
	abstract void temp4();
	
	void temp1() {
	
		System.out.println("Temp1");
	}
	
	void temp2() {
		
		System.out.println("Temp2");
	}

	public static void main(String[] args) {
		
		AbstractImplem ai =new AbstractImplem() {
			
			@Override
			void temp() {
				System.out.println("Temp called");
				
			}

			@Override
			void temp4() {
				
				System.out.println("Temp4 called");
				
			}
		};
		ai.temp();
		ai.temp1();
	}
}
