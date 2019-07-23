package com.sathish83.interviewpreparation.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreateObject implements Cloneable{
	
	private int ways = 4;
	
	private String what ="objectCreationways";

  WaysToCreateObject(){
		
		System.out.println("Constructor called..");
	}
  

	void byNewKeyword() {
		
		System.out.println("Object created by new keyword");
	}
	
	void byNewInstance() {
		
		System.out.println("Object created by new Instance");
	}
	
	void byCloneMethod() {
		System.out.println("Object created by clone method");
	}
	
	void byNewIntanceMethod() {
		System.out.println("Object created by new instance reflect constuctor ");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//By New Keyword
		WaysToCreateObject createWay1 = new WaysToCreateObject(); // constructor invoke
		createWay1.byNewKeyword();
	
		
		//By New Instance
		WaysToCreateObject createWay2 = WaysToCreateObject.class.newInstance(); // constructor invoke
		createWay2.byNewInstance();
	
		// By Clone method (should implement cloneable interface) // constructor never called by clone method
		WaysToCreateObject createWay3= (WaysToCreateObject) createWay1.clone();
		createWay3.byCloneMethod();
	
		// For deserlization please refer deserilization
		
		
		// by NewInstanceConstructor
		Constructor<WaysToCreateObject> constructor = WaysToCreateObject.class.getDeclaredConstructor();
		WaysToCreateObject createWay5= constructor.newInstance();
		createWay5.byNewIntanceMethod();
	}
	
	
}
