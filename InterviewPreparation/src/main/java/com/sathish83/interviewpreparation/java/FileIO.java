package com.sathish83.interviewpreparation.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.springframework.util.ResourceUtils;

public class FileIO {

	private static File inputFile = null;
	
	private static File outPutFile = null;
	
	void fileInputStreamTest() throws IOException {
		
		try(FileInputStream fipStream = new FileInputStream(inputFile)){
			 int i=0;    
	            while((i=fipStream.read())!=-1){    
	             System.out.print((char)i);    
	            }
	            System.out.println("");
	            System.out.println("InputSTream Succssfully Tested");
		}finally {
			System.out.println("");
		}
		
	}
	
	void fileOutStreamTest() throws IOException {
		try(FileOutputStream foutStream = new FileOutputStream(outPutFile)){
			String output ="OutPutStreamTest";
			foutStream.write(output.getBytes());
			foutStream.write("\n".getBytes());
			System.out.println("OutPutStream Succssfully Tested");
		}finally {
			System.out.println("");
		}
	}
	
	void byteInputStreamTest() throws IOException {
		
		byte[] b = "Hi sathish".getBytes();
        try(ByteArrayInputStream byteInput=new ByteArrayInputStream(b)){
    		 
    		 
    	 }finally {
    		 
    		 System.out.println(""); 
    	 }
	}
	
     void byteOutPutStreamTest() throws IOException {
		
    	 try(ByteArrayOutputStream byteOutPut = new ByteArrayOutputStream()){
    		 FileOutputStream foutStream = new FileOutputStream(outPutFile,true);
    		 foutStream.write("ByteArrayStream".getBytes());
    		 foutStream.write("\n".getBytes());
    		 byteOutPut.writeTo(foutStream);
    	 }finally {
    		 
    		System.out.println(""); 
    	 }
    	
	}
     
     void bufferWriter() throws IOException {
    	 
    	 try(FileWriter fw= new FileWriter(outPutFile, true)){
    		 BufferedWriter bw = new BufferedWriter(fw);
    		 bw.write("BufferWriter example");
    		 bw.newLine();
    		 bw.close();
    	 }
    	 
     }
     
     void bufferReader() throws IOException {
    	 
    	 
    	 try(InputStreamReader isr=new InputStreamReader(System.in)) {
    		 BufferedReader br = new BufferedReader(isr);
    		 String enteredData="";
    		 while(!enteredData.equalsIgnoreCase("stop")) {
    			 System.out.println("Enter data");
    			 enteredData=br.readLine();
    			 System.out.println("data is"+enteredData);
    		 }
    		 System.out.println("Tou stopped the process...");
    		 br.close();
    	 }
     }
	
	public static void main(String[] args)  {
		
		FileIO fileObj = new FileIO();
		try {
			//java for loading files
			inputFile  = new File(FileIO.class.getClassLoader().getResource("file_input").getFile());
			outPutFile = new File(FileIO.class.getClassLoader().getResource("file_output").getFile());
			
			//spring for loading files
			inputFile = ResourceUtils.getFile("classpath:file_input");  // ResourceUtils available in spring
			outPutFile = ResourceUtils.getFile("classpath:file_output");
			
			//file input and outputstreams
			fileObj.fileInputStreamTest();
			fileObj.fileOutStreamTest();
			
			//byte input and outstream
			
			//fileObj.byteInputStreamTest();
			fileObj.byteOutPutStreamTest();
			
			// Buffer reader and writer
			
			fileObj.bufferWriter();
			fileObj.bufferReader();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
           catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
