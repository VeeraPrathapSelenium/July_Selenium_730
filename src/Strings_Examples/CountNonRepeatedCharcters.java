package Strings_Examples;

import javax.xml.bind.ParseConversionEvent;

public class CountNonRepeatedCharcters {

	public static void main(String[] args) {
		
		String str="111225643333444455550698966667777888";
		
		String temp="";
		int counter=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char currentcharacter=str.charAt(i);
			
			
		if(! temp.contains(Character.toString(currentcharacter)))	
		{
			temp=temp+currentcharacter;
			
			for(int j=0;j<=str.length()-1;j++)
			{
				
				char checkingcharacter=str.charAt(j);
				
				if(currentcharacter==checkingcharacter)
				{
					counter++;
					
				}
			} 	
			System.out.println("The Character "+currentcharacter+" is repeated for "+counter);
			counter=0;
		}
		
		
		}
		

	

}
}