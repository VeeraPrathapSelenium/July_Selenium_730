package Strings_Examples;

import java.util.Scanner;

public class PrintPrimeNumber {

	public static void main(String[] args) {

		int counter=0;
		
		System.out.println("*****************  Enter a number ****************");
		Scanner sc=new Scanner(System.in);
		int numb=sc.nextInt();
		
		for(int i=1;i<=numb;i++)
		{
			
			if(numb % i==0)
			{
				counter++;
			}
		}
		
		if(counter==2)
		{
			System.out.println("The Given number is Prime");
			
		}else
		{
			System.out.println("The Given number is not a Prime");
		}

	}

}
