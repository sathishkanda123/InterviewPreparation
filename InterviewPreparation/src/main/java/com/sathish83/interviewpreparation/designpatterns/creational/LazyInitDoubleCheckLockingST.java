package com.sathish83.interviewpreparation.designpatterns.creational;

public class LazyInitDoubleCheckLockingST {

	private static LazyInitDoubleCheckLockingST lazyDCST;
	
	public static LazyInitDoubleCheckLockingST getInstance() {
		
		if(lazyDCST==null) {
			
			synchronized (LazyInitDoubleCheckLockingST.class) {
				
				if(lazyDCST==null) {
					
					lazyDCST = new LazyInitDoubleCheckLockingST();
				}
				
			}
		}
		return lazyDCST;
	}
	
	
}
