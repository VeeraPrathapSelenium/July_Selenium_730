package com.SimpleMethod;

public class SimpleMethod {
	
	
	static int c;
	
	

	public static void main(String[] args) {
		
//Creating an object
		
		SimpleMethod sampleobj=new SimpleMethod();
		
		
		sampleobj.mul();
		

	}
	
	
	
	
	public  void add()
	{
		int a,b,c;
		
		a=10;
		b=20;
		
		c=a+b;
		
		System.out.println("c= "+c);
		
	}
	
	
	public void mul()
	{
		
		System.out.println(c*10);
	}
	
	
	
	

}
