package com.sathish83.interviewpreparation.designpatterns;

public class EagerlyInitializedStaticBlockSingleton {

	private static EagerlyInitializedStaticBlockSingleton  eeisbt ;
	
	private EagerlyInitializedStaticBlockSingleton() {
		
	}
	
	public static EagerlyInitializedStaticBlockSingleton getEEISBT() {
		return eeisbt;
	}
	
	static {
		try {
			eeisbt = new EagerlyInitializedStaticBlockSingleton();
		}catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
