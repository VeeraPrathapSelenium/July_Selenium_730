package Strings;

public class TrimMethod {

	public static void main(String[] args) {
	
		
		String str="       Hello i am learning java                    ";
		
		System.out.println("the length of a string before trim "+str.length());
		
		str=str.trim();
		
		System.out.println("the length of a string After trim "+str.length());
		
	}

}
