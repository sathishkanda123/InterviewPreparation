package com.sathish83.interviewpreparation.model;

import java.util.List;

import com.sathish83.interviewpreparation.annotations.TestAnnotation;

public class JobSeeker {

	
	private String name;
	
	private int experience;
	
	private List<String> skills;
	
	private Location localtion;
	
	private Company appliedCompany;
	
	@TestAnnotation(author = "Sathish", version = "1.0")
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
