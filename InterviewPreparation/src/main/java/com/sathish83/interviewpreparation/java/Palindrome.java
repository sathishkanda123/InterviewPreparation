package com.sathish83.interviewpreparation.java;

import java.util.Scanner;
/*
 * A string is said to be palindrome
 *  if reverse of the string is same as string. For example, “abba” is palindrome, but “abbc” is not palindrome.
 */
public class Palindrome<T> {

	private void doPalindrome(String value) {
		int l = 0;
		int  h = value.length()-1;
		boolean isPalindrome = true;
		while(h>1) {
			if((value.charAt(l++))!=value.charAt(h--)) {
				System.out.println("Not Palindrome");
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("Its a Palindrome..");
		}
	}
	
	public static void main(String[] args) {
		
		Palindrome<String> pl = new Palindrome<String>();
		System.out.println("If you want to stop the process enter stop");
		try(Scanner sc = new Scanner(System.in)){
			while(true) {
				System.out.println("Enter the value for palindrome");
				String value = sc.nextLine();
				if(value.equals("stop")) {
					System.out.println("Stopped the process..Thanks for using Palindrome");
					break;
				}
				pl.doPalindrome(value);	
			}
		}
	}

}
