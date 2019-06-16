package com.sathish83.interviewpreparation.model;

public class Location {
	
	private String locationName;
	
	private String country;
	 

	public Location(String locationName, String country) {
		super();
		this.locationName = locationName;
		this.country = country;
	}

	public Location(String locationName) {
		super();
		this.locationName = locationName;
		this.country = "India";
	}
	
	public Location() {
		super();
		this.locationName = "Bengaluru";
		this.country = "India";
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
