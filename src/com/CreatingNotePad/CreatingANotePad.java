package com.CreatingNotePad;

import java.io.File;
import java.io.IOException;

public class CreatingANotePad {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\Users\\tm\\Desktop\\FileTest","abc.txt");
	
		
		//Check for file existance
		if(f.exists())
		{
			//delete a file
			f.delete();
		}else
		{
			//create a new File
			f.createNewFile();
		}
		
		
		
	}

}
