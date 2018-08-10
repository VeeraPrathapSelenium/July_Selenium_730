package com.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		
		String source="my email id is abc.yyz@tcs.com";
		
		String pattern="[a-z]*\\.[a-z]*\\@tcs\\.com";
		validateRegEx(source, pattern );

}
	
	
	
	
	public static boolean validateRegEx(String source, String pattern )
	{
		boolean flag=false;
//		String source="I want to extract the PAN Number as GHJIP9600E";
//		
//		String pattern ="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		
		Pattern ptrn=Pattern.compile(pattern);
		
		Matcher matches=ptrn.matcher(source);
		
		//System.out.println(matches.find());
		
		
		while(matches.find())
		{
			System.out.println("Pattern is avilable");
			System.out.println(matches.group());
			flag=true;
		}
		
		if(! flag)
		{
			System.out.println("No Pattern Exist");
		}
		return flag;
		
		
		

	
	}
}
