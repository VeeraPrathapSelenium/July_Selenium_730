package com.Static_InstanceBlock;

public class ParentClass {
	
	static
	{
		System.out.println("Hello i am from Parent class static block");
	}
	
	{
		System.out.println("Hello i am from Parent class instance  block");
	}


}
