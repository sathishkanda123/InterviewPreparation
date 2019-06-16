package com.sathish83.interviewpreparation.java8;

import java.util.Random;

public class ObjectMethods {

	int a = 20;
	
	String name="Sathish";
	
	@Override
	public String toString() {
		return "InterviewPreparation--"+"@@"+Integer.toHexString(hashCode());
	}
	
	@Override
	public int hashCode() {
		return 83*83+(new Random().nextInt(12525252));
	}
	
	@Override
	public boolean equals(Object o) {
	
		if(this==o) {
			return true;
		}
		
		if(!(o instanceof ObjectMethods)) {
			return true;
		}
		
		ObjectMethods om = (ObjectMethods) o;
		if(this.a==om.a) {
			System.out.println("Values are true");
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		ObjectMethods om = new ObjectMethods();
		System.out.println(om.toString());
		System.out.println(om.hashCode());
		ObjectMethods om2 = new ObjectMethods();
		om2.a=20;
		System.out.println("Equals object"+om.equals(om2));
	}
}
