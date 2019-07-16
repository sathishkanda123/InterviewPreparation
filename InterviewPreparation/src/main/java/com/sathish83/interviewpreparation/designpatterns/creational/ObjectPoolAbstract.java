package com.sathish83.interviewpreparation.designpatterns.creational;

import java.util.HashMap;

public abstract class ObjectPoolAbstract<T> {

	long deadTime;
	
	T t = null ;
	
	HashMap<T, Long> lock, unlock;
	
	ObjectPoolAbstract(){
		deadTime = 1000;
		lock = new HashMap<T, Long>();
		unlock = new HashMap<T, Long>();
	}
	
	abstract T create();
	
	abstract boolean validate(T t);
	
	abstract void dead(T t);
	
	synchronized T takeOut() {
		
		T[] t = null ;
		long now = System.currentTimeMillis();
		
		if(unlock.size()>0) {
			unlock.forEach((k,v)->{
				if(now-unlock.get(k)>deadTime) {
					unlock.remove(k);
					dead(t[0]);
				}else {
					if(validate(t[0])) {
						unlock.remove(k);
						lock.put(k, now);
					}else {
						
						//object failed validation
						unlock.remove(k);
						dead(t[0]);
					}
				}
				
			});
			
		}else {
			t[0] = create();
			lock.put(t[0], now);
		}
		
		return t[0];
		
	}

	 synchronized void takeIn(T t) 
	    { 
	        lock.remove(t); 
	        unlock.put(t, System.currentTimeMillis()); 
	    } 
	
	
}
