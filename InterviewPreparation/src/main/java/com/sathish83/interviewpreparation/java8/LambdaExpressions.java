package com.sathish83.interviewpreparation.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.cglib.core.CollectionUtils;

import com.sathish83.interviewpreparation.model.Company;


public class LambdaExpressions {

	public static void main(String[] args) {
		
		Company[] companyArray = new Company[4];
		companyArray[0] = new Company();
		companyArray[0].setCompanyName("Tesla");
		companyArray[1] = new Company();
		companyArray[1].setCompanyName("Google");
		companyArray[2] = new Company();
		companyArray[2].setCompanyName("Microsoft");
		companyArray[3] = new Company();
		companyArray[3].setCompanyName("Apple");
		
		List<Company> companiesList = Arrays.asList(companyArray);
		
		//for lambda expressions
		FunctionalInterfaces fi = (int a)->{
				System.out.println("Lambda funtional interfaces working"+" "+a);
				System.out.println("");
		};
		fi.testMethod(10);
		
		System.out.println("Looping through for each");
		companiesList.forEach(val->{
		   if(val.getCompanyName().equals("Microsoft")) {
			   System.out.println(val.getCompanyName()+" --- "+"Doing alot for poor people");
		   }else{
			   System.out.println(val.getCompanyName());
		   }
	   });
		
		Collections.sort(companiesList,(c1,c2)->{
			return c1.getCompanyName().compareToIgnoreCase(c2.getCompanyName());
		});
		
		// after sort 
        System.out.println("");
		System.out.println("After Sorting..");
		companiesList.forEach(val->System.out.println(val.getCompanyName()));
		
		
	}
	
	
	
}
