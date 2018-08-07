package com.Arrays;

public class StringArrays {

	public static void main(String[] args) {
		
		
		String[] arr=new String[3];
		arr[0]="Prathap";
		arr[1]="Hari";
		arr[2]="Naresh";
		//print a single item
		System.out.println(arr[0]);
		
		System.out.println("****************************");
		//get the length of an array
		
		int len=arr.length;
		
		System.out.println(len);
		//print all the items in an array
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(arr[i]);
			
		}
		

	}

}
