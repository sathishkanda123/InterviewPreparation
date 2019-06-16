<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Java-Others</h3>
<ul>
		<li>
		  What is ShallowCopy and Deep Copy?<br>
		 <p>
		    Before Going to the topic , we should know about 2 things Reference and New
		    Ex:- Let me explain in interview words, we can attend interview in 2 ways through consultancy(reference), direct(new).
		    <br>
		    if any change in interviewer(not attend) it impacts consultancy and vice versa<br>
		    if any change in new ..nothing impacts(Company will ignores the profile)
		    Refernce of the Objects
		    <p>
	
		    Let take i have 3 classes
		    <ul>
		    <li>
		    Company<br>
    public class Company {
	
	private String companyName;
	
	private Location interviewLocation;
		    }
		    
		    
		    </li>
		    	    <li>
	Jobseeker<br>
	public class JobSeeker {

	private String name;
	
	private int experience;
	
	private List<String> skills;
	
	private Location localtion;
	
	private Company appliedCompany;
	}
	
	</li>
	<li> Location<br>
	public class Location {
	
	private String locationName;
	
	private String country;
	 
	}
	</li>
		    </ul> 
	<ul><u>Refernce Objects</u></ul>	    
	 I created two objects for jobsekker with js1 and js2 and i do js1=js2 - now both refrences are same <br>
	 <div style="background-color:"green">
	 <div>
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
		
		</div>
		<div>
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
		</div>
		jobseeker1=jobseeker2; (if you create any one object both will impact)
		<div>
		jobseeker1.setName("Lekitha");
		System.out.println("Jobseeker1Name.." + jobseeker1.getName());
		System.out.println("Jobseeker2Name.." + jobseeker2.getName());
		System.out.println("Jobseeker Applied Company Name.." + jobseeker1.getAppliedCompany().getCompanyName());
		System.out.println("Jobseeker Stying Location.." + jobseeker1.getLocaltion().getLocationName());
		System.out.println("Jobseeker Applied Location.." + jobseeker1.getAppliedCompany().getInterviewLocation().getLocationName());
		System.out.println("HashCode"+"Jobseeker1"+jobseeker1.hashCode()+"---"+"JobSeeker2"+jobseeker2.hashCode());
	 </div>
	 </div> 	    	    
		    </p>
		 </p>
		</li>
		<li></u>Shallow Copy</u>
		<p>
			
		</p>
		</li>
	</ul>
<ul>
<li><u>Custom Annotations</u>
<p>


</p>
</li>

</ul>

</body>
</html>