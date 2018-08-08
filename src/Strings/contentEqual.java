package Strings;

public class contentEqual {

	public static void main(String[] args) {
String actual="Hello india";
		
		String expectedvalue="hello india";
		
		boolean status=actual.contentEquals(expectedvalue);
		
		if(status)
		{
			System.out.println("Both The strings are same");
		}else
		{
			System.out.println("Both The strings are not same");
		}
		

	}

}
