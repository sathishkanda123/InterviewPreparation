package com.sathish83.interviewpreparation.java;

import java.util.Random;

public class ObjectMethods implements Cloneable{

	int a = 20;

	@Override
	public String toString() {
		return "InterviewPreparation--" + "@@" + Integer.toHexString(hashCode());
	}

	@Override
	public int hashCode() {
		return 83 * 83 + (new Random().nextInt(12525252));
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}

		if (!(o instanceof ObjectMethods)) {
			return true;
		}

		ObjectMethods om = (ObjectMethods) o;
		if (this.a == om.a) {
			System.out.println("Values are true");
			return true;
		}
		return false;
	}

	public static void clonee(ObjectMethods os) {
		
		try {
			ObjectMethods objClone = (ObjectMethods) os.clone();
			System.out.println("Clone value"+objClone.a);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void main(String[] args) {

		ObjectMethods om = new ObjectMethods();
		System.out.println("ToString Implementation" +om.toString());
		System.out.println("HashCode Implementation" + om.hashCode());
		ObjectMethods om1 = new ObjectMethods();
		om1.a = 20;
		System.out.println("Equals Implementation" + om.equals(om1));
		System.out.println("Getclass Implementation" + om.getClass());
		// notify(),wait(),notifyall()-explained in separate thread
		clonee(om);   
	}

	

}
