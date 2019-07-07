package com.sathish83.interviewpreparation.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.util.ResourceUtils;

public class FileIO {

	private static File inputFile = null;
	
	private static File outPutFile = null;
	
	void FileInputStreamTest() {
		
		
	}
	
	void FileOutStreamTest() throws FileNotFoundException {
		
		
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileIO fileObj = new FileIO();
		fileObj.FileInputStreamTest();
		fileObj.FileOutStreamTest();
		
		//java 
		inputFile  = new File(FileIO.class.getClassLoader().getResource("file_input").getFile());
		outPutFile = new File(FileIO.class.getClassLoader().getResource("file_output").getFile());
		
		//spring for loading files
		inputFile = ResourceUtils.getFile("classpath:file_input"); // ResourceUtils available in spring 
		outPutFile = ResourceUtils.getFile("classpath:file_output");
		
	}
}
