package Strings;

public class equalsIgnore {

	public static void main(String[] args) {
String actual="Hello india";
		
		String expectedvalue="hello india";
		
		boolean status=actual.equalsIgnoreCase(expectedvalue);
		
		if(status)
		{
			System.out.println("Both The strings are same");
		}else
		{
			System.out.println("Both The strings are not same");
		}
		

	}

}
