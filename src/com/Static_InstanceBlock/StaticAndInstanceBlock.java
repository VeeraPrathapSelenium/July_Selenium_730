package com.Static_InstanceBlock;

public class StaticAndInstanceBlock extends ParentClass {
	
	StaticAndInstanceBlock()
	{
		
		System.out.println(" iam from constructor");
	}

	public static void main(String[] args) {
		
		
		StaticAndInstanceBlock obj=new StaticAndInstanceBlock();
		
		

	}
	
	static
	{
		System.out.println("Hello i am from static block");
	}
	
	{
		System.out.println("Hello i am from instance  block");
	}

}
