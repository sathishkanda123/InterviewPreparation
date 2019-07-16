package com.sathish83.interviewpreparation.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;

public class TimerTask {

	static long deadTime = 1563258924727l;
	static HashMap<String, Long> avilableObjects = new HashMap<>();
	
	static java.util.TimerTask scheduleEveryPoint = new java.util.TimerTask() {
		
		@Override
		public void run() {
			if(avilableObjects.size()>0) {
				avilableObjects.put("Sathish", (avilableObjects.get("Sathish")-1));
				if(avilableObjects.get("Sathish")>deadTime) {
					avilableObjects.remove("sathish");
				}
			}else {
				System.out.println("Insert the value in available Objects"+System.currentTimeMillis());
				avilableObjects.put("Sathish", System.currentTimeMillis());
			}
			System.out.println("Time is"+new SimpleDateFormat("hh:mm:ss").format(new Date(System.currentTimeMillis())));
		}
	};
	
	
	
	

	/*
	 * 
	 * task - task to be scheduled.
delay - delay in milliseconds before task is to be executed.
period - time in milliseconds between successive task executions.
	 */
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(scheduleEveryPoint, 50l,1000l);
	}
}
