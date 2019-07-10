package com.sathish83.interviewpreparation.designpatterns;


public class LazyInitializedSingleTon {

	private static LazyInitializedSingleTon list ;
	
	
	public static synchronized LazyInitializedSingleTon getInstance() {
		
		if(list==null) {
			return new LazyInitializedSingleTon();
		}
		return list;
	
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
