package com.sathish83.interviewpreparation.java;

abstract class AnnonymousClass{
	
	abstract void annonymousMethod() ;

}

public class DifferentTypesOfInnerClasses {

	private int a = 30;
	
	
	static class StaticsClass{
		
		static void staticMethod() {
			System.out.println("Static method class..");
		}
	}
	
	
	class MemberInnerClass{
		
		void innerMethod() {
			
			System.out.println("Inside inneememeber Class"+a);
		}
	}
	
	void outSideClassMethod() {
		
		System.out.println("Outside class");
	}
	
	void outSideLocalClassCreation() {
		
		class Local{
			
			int a =30;
			
			void msg() {
				
				System.out.println("Method local class..");
				
			}
		}
		
		Local localMethodclass = new Local();
		localMethodclass.msg();
	}
	
	
	
	public static void main(String[] args) {
		
		DifferentTypesOfInnerClasses outside=new DifferentTypesOfInnerClasses();
		
		//member inner class 
		DifferentTypesOfInnerClasses.MemberInnerClass innerclass1 = outside.new MemberInnerClass();
		innerclass1.innerMethod();
		
		//Annonymous Inner class
		AnnonymousClass ac= new AnnonymousClass() {
			@Override
			void annonymousMethod() {
				System.out.println("Anonymous called");
			}
			
		};
		ac.annonymousMethod();
		
		//class indie method
		outside.outSideLocalClassCreation();

		//static class
		DifferentTypesOfInnerClasses.StaticsClass.staticMethod();

	}
	
}
