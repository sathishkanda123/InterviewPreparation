package com.sathish83.interviewpreparation.java;

public class GenericsTest<T> {

	
	private T a;
	
	T getValue(T a) {
		return a;
	}
	
	public static void main(String[] args) {
		
		GenericsTest<Integer> gt = new GenericsTest<Integer>();
		System.out.println(gt.getValue(10));
	}
	
}
