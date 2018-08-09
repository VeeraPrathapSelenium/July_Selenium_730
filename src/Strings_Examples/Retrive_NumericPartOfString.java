package Strings_Examples;

public class Retrive_NumericPartOfString {

	public static void main(String[] args) {
		/*
		 * Problem Statement: In the given source string , Retrive the numeric part
		 */

		String str="The transaction id : 1089 is generated sucessfully";
		String temp="";
		for(int i=0;i<=str.length()-1;i++)
		{
			
			
			char c=str.charAt(i);
			
			if(Character.isDigit(c))
			{
				temp=temp+c;
				
				
				
			}
			
		}
		
		System.out.println("The numeric value is "+temp);
		
		//Try with substring
	}

}
