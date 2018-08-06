package SimpleIf;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		

		System.out.println("Enter a number from the console");
		Scanner sc=new Scanner(System.in);
		
		int daynumber=sc.nextInt();
		
		System.out.println("The value entered by the user is "+daynumber);
		
		
		
		switch (daynumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Entry");
			break;
		}
	}

}
