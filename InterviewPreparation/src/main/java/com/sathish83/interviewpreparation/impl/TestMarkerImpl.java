package com.sathish83.interviewpreparation.impl;

import com.sathish83.interviewpreparation.java.MarkerInterfaces;

public class TestMarkerImpl {

	public void testMI(MarkerImplementation mi) {
		
		if(mi instanceof MarkerInterfaces) {
			System.out.println("Implements marker interface...");
		}else {
			throw new RuntimeException("Should implement MarkerInterfaces");
		}
	}

}
