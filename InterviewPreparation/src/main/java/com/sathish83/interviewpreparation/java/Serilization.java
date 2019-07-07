package com.sathish83.interviewpreparation.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sathish83.interviewpreparation.model.JobSeeker;

public class Serilization implements Serializable{

	private static final long serialVersionUID = -3816785419276251054L;

	public static void main(String[] args) {

		
		JobSeeker js = new JobSeeker();
		js.setName("Serilization");
		js.setExperience(4);
		
		//serilization
		File f = new File(Serilization.class.getClassLoader().getResource("serlization_test.txt").getFile());
		try(FileOutputStream fout=new FileOutputStream(f)) {
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(js);
			System.out.println("Serilization Done...");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
	   // deserilization
	
		try(FileInputStream fin=new FileInputStream(f)){
			ObjectInputStream oin= new ObjectInputStream(fin);
			JobSeeker jsout = (JobSeeker) oin.readObject();
			System.out.println("JobSeeker Name--"+jsout.getName());
		} catch (IOException | ClassNotFoundException  e) {
			System.out.println("Exception Caught"+e.getMessage());
		} 
		
		
	
	
	}
}
