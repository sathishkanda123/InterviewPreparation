package com.sathish83.interviewpreparation.designpatterns;

public class LazyInitDoubleCheckLockingST {

	private static volatile LazyInitDoubleCheckLockingST lazyDCST;
	
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
