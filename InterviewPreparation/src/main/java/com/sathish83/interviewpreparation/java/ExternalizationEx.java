package com.sathish83.interviewpreparation.java;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.sathish83.interviewpreparation.model.JobSeeker;

public class ExternalizationEx implements Externalizable{

	String name = "Sathish";
	int experince=4;
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		experince = in.readInt();
		System.out.println("Read External Name is "+name+"Exp"+experince);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(experince);
		
	}
	
	public static void main(String[] args) {
		
		ExternalizationEx e = new ExternalizationEx();
		//serilization
				File f = new File(Serilization.class.getClassLoader().getResource("serlization_test.txt").getFile());
				try(FileOutputStream fout=new FileOutputStream(f)) {
					ObjectOutputStream out = new ObjectOutputStream(fout);
					out.writeObject(e);
					System.out.println("Serilization Done...");
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
		
				   // deserilization
				try(FileInputStream fin=new FileInputStream(f)){
					ObjectInputStream oin= new ObjectInputStream(fin);
					ExternalizationEx ee=(ExternalizationEx) oin.readObject();
				} catch (IOException | ClassNotFoundException  ex) {
					System.out.println("Exception Caught"+ex.getMessage());
				} 
	
	}
}
