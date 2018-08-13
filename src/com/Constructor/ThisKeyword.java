package com.Constructor;

public class ThisKeyword {
	
int a=10;

int b=20;
	public static void main(String[] args) {
		
		ThisKeyword ref=new ThisKeyword();
		ref.add(30, 20);
	}

	
	
	public void add(int a,int b)
	{
		System.out.println((this.a+this.b)+(a+b));
		
	}
	
	
	
	
}
