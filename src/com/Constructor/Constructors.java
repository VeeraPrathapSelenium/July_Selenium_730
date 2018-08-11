package com.Constructor;

public class Constructors {
	
	//Non Parameterized  constructor
	Constructors()
	{
		System.out.println("i am a constructor");
	}
	
	// Parameterized  constructor
	Constructors(int a, int b)
	{
		this();
		System.out.println("i am a constructor adding two numbers "+(a+b));
	
	}
	
	

	public static void main(String[] args) {
		

		
		//Two argument constructor
				Constructors obj=new Constructors(10,52);

	}

}
