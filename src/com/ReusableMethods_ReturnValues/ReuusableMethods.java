package com.ReusableMethods_ReturnValues;

public class ReuusableMethods {

	public static void main(String[] args) {

		int output;
		output=add(20,30);
		System.out.println("The sum of two numbers is "+output);

		System.out.println("*********************************************");
		
		
		output=add(30,30);
		System.out.println("The sum of two numbers is "+output);

		
		
		
	}

	
	public static int add(int a,int b)
	{	

		return a+b;
		
	
	}
	
	
	
	
}
