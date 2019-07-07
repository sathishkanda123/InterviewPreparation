package com.sathish83.interviewpreparation.model;

import java.io.Serializable;
import java.util.List;

import com.sathish83.interviewpreparation.annotations.TestAnnotation;

@TestAnnotation(author="sathish",version="1.0")
public class JobSeeker implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private int experience = 10;
	
	private List<String> skills;
	
	private Location localtion;
	
	private Company appliedCompany;
	
	public JobSeeker(JobSeeker jobseeker) {
		
		this.name= jobseeker.name;
		this.experience=jobseeker.experience;
		this.appliedCompany=jobseeker.appliedCompany;
	
	}

	public JobSeeker() {
	}

	public JobSeeker(String name2, int experience2, Company appliedCompany2, Location localtion2,
			List<String> skills2) {
		
		this.name=name2;
		this.experience=experience2;
		this.appliedCompany=appliedCompany2;
		this.localtion=localtion2;
		this.skills=skills2;
		
	}

	@TestAnnotation(author = "Sathish83", version = "1.0")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Location getLocaltion() {
		return localtion;
	}

	public void setLocaltion(Location localtion) {
		this.localtion = localtion;
	}

	public Company getAppliedCompany() {
		return appliedCompany;
	}

	public void setAppliedCompany(Company appliedCompany) {
		this.appliedCompany = appliedCompany;
	}

}
