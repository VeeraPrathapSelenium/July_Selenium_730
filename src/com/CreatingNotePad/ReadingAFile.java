package com.CreatingNotePad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\tm\\Desktop\\FileTest","abc.txt");
		
		FileReader fr=new 		FileReader(f);
		
		BufferedReader br=new 	BufferedReader(fr);
		
	String filecontent= br.readLine();
	

	//to read all thedata from a notepad
	
	while(!(filecontent==null))
	{
		System.out.println(filecontent);
		filecontent= br.readLine();
	}
		
		

	}

}
