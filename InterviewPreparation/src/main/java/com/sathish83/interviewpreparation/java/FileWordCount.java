package com.sathish83.interviewpreparation.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.util.ResourceUtils;

public class FileWordCount {

	
	private int noOfLines;
	
	private int noOfWords;
	
	private int noOfCharcters;
	
	private void getWordCount(FileReader fr, String word) throws IOException {
		System.out.println("");
		int lineNo = 1;
		int totalWordsCount = 0;
		String wordCount;
		System.out.println("");
		BufferedReader br = new BufferedReader(fr);
        while((wordCount=br.readLine())!=null) {
			
			if(!wordCount.equals("")) {
				String[] wordList = wordCount.split("\\s+"); 
				int noOfWordsFoundInLine=0;
				for(String searchingWord:wordList) {
					if(searchingWord.equalsIgnoreCase(word)) {
						noOfWordsFoundInLine ++;
						totalWordsCount++;
					}
				}
				System.out.println("Total words in the line "+""+lineNo+"is"+noOfWordsFoundInLine);
				lineNo++;
			}
			noOfLines++;
		}
        System.out.println("Total words in the file is"+totalWordsCount);
	}
	
	void getTotalNoOfWordsCount(FileReader fr) throws IOException {

		BufferedReader br = new BufferedReader(fr);
		System.out.println("");
		int lineNo = 1;
		String wordCount;
		while((wordCount=br.readLine())!=null) {
			
			if(!wordCount.equals("")) {
				String[] wordList = wordCount.split("\\s+"); 
				int wordsInLine =0;
				wordsInLine = wordList.length;
				noOfWords+= wordsInLine;
				System.out.println("Total words in the line "+""+lineNo+"is"+wordsInLine);
			}
			noOfLines++;
		}
		System.out.println("No fo words in the file is ##"+" "+noOfWords);
	}
	
	void getNoLines(FileReader fr) throws IOException {
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println("");
		String line;
		int noOfLinesInFile=0;
		while((line = br.readLine()) != null) {
			noOfLinesInFile++;
		}
		System.out.println("No fo Lines in the file is ##"+" "+noOfLinesInFile);
	}
	
	
	void getCountOfCharacters(FileReader fr) throws IOException {
		
	    System.out.println("");
		String charcterCount;
		int lineNo = 1;
		BufferedReader br = new BufferedReader(fr);
		while((charcterCount=br.readLine())!=null) {
			
			if(!charcterCount.equals("")) {
				int charctersInLine =0;
				charctersInLine = charcterCount.length();
				noOfCharcters+= charctersInLine;
				System.out.println("Total charcters in the line "+""+lineNo+"is"+charctersInLine);
				lineNo++;
			}
		}
		System.out.println("No fo charcters in the file is ##"+" "+noOfCharcters);
		
	}
	
	
	public static void main(String[] args) {

    		Scanner sc = new Scanner(System.in);
		try {
			FileWordCount fwc = new FileWordCount();
			try(FileReader fr = new FileReader(ResourceUtils.getFile("classpath:file_input"))){
				fwc.getCountOfCharacters(new FileReader(ResourceUtils.getFile("classpath:file_input")));
				fwc.getNoLines(new FileReader(ResourceUtils.getFile("classpath:file_input")));
				fwc.getTotalNoOfWordsCount(new FileReader(ResourceUtils.getFile("classpath:file_input")));
				System.out.println("Enter the word you want count");
				fwc.getWordCount(fr,sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
		   sc.close();
		}
	}

}
