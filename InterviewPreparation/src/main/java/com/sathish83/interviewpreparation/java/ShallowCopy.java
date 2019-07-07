package com.sathish83.interviewpreparation.java;

import java.util.Arrays;

import com.sathish83.interviewpreparation.model.Company;
import com.sathish83.interviewpreparation.model.JobSeeker;
import com.sathish83.interviewpreparation.model.Location;

/*
 * Shallow copy is a clone of parnt object 
 */
public class ShallowCopy {
	
	public static void main(String[] args) {
		
		// JobSeeker object -1
		JobSeeker jobseeker1 = new JobSeeker();
		jobseeker1.setName("Sathish");
		jobseeker1.setExperience(5);
		jobseeker1.setLocaltion(new Location());
		jobseeker1.setSkills(Arrays.asList("Java","Angular","SpringBoot"));
		Company c = new Company();
		c.setCompanyName("CTS");
		c.setInterviewLocation(new Location("Bengaluru-ManyataTechPark"));
		jobseeker1.setAppliedCompany(c);
		
		// JobSeeker object -2
		
		JobSeeker jobseeker2 = new JobSeeker();
		jobseeker2.setName("Shadhap");
		jobseeker2.setLocaltion(new Location("Chennai"));
		jobseeker2.setSkills(Arrays.asList("Java","SpringBoot","DataStructures"));
		Company c2 = new Company();
		c2.setCompanyName("TCS");
		c2.setInterviewLocation(new Location("Chennai-Sholingnalur"));
		jobseeker2.setAppliedCompany(c2);
		jobseeker1=jobseeker2; // when ever we assigned all values from j2 to j1 // reference copy or copy constructor also
		jobseeker1.setName("Lekitha"); // both j1 and j2 will change
		jobseeker1.getAppliedCompany().setCompanyName("Infosys"); // both j1 and j2 will change
		System.out.println("Jobseeker1Name.." + jobseeker1.getName());
		System.out.println("Jobseeker2Name.." + jobseeker2.getName()); 
		System.out.println("Jobseeker Applied Company Name.." + jobseeker1.getAppliedCompany().getCompanyName());
		System.out.println("Jobseeker2CompanyName.." + jobseeker2.getAppliedCompany().getCompanyName()); // jobsekker 2 also changed
		System.out.println("Jobseeker1Exp.." + jobseeker1.getExperience());
		System.out.println("Jobseeker2Exp.." + jobseeker2.getExperience());		
	    
	}

}
