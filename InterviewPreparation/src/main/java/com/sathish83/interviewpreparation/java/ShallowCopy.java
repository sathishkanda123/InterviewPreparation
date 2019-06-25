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
		jobseeker2.setExperience(3);
		jobseeker2.setLocaltion(new Location("Chennai"));
		jobseeker2.setSkills(Arrays.asList("Java","SpringBoot","DataStructures"));
		Company c2 = new Company();
		c2.setCompanyName("TCS");
		c2.setInterviewLocation(new Location("Chennai-Sholingnalur"));
		jobseeker2.setAppliedCompany(c2);
		
		jobseeker1=jobseeker2;
		jobseeker1.setName("Lekitha");
		System.out.println("Jobseeker1Name.." + jobseeker1.getName());
		System.out.println("Jobseeker2Name.." + jobseeker2.getName());
		System.out.println("Jobseeker Applied Company Name.." + jobseeker1.getAppliedCompany().getCompanyName());
		System.out.println("Jobseeker Stying Location.." + jobseeker1.getLocaltion().getLocationName());
		System.out.println("Jobseeker Applied Location.." + jobseeker1.getAppliedCompany().getInterviewLocation().getLocationName());
		System.out.println("HashCode"+"Jobseeker1"+jobseeker1.hashCode()+"---"+"JobSeeker2"+jobseeker2.hashCode());
	   
			
	}

}
