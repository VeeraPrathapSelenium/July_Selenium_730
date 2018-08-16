package com.CreatingNotePad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\tm\\Desktop\\FileTest","abc.txt");
		
		FileWriter fw=new FileWriter(f);
		
		
		PrintWriter pw =new PrintWriter(fw);
		
		pw.write("Hello i am writting a new file");
		
		pw.flush();
		pw.close();
		
		
	}

}
