package com.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
	
		Object[] arr=new Object[3];
		
		arr[0]="prathap";
		arr[1]=1223;
		arr[2]="hello";
		
		for (Object item : arr) {
			
			System.out.println(item);
			
		}
		
	}

}
