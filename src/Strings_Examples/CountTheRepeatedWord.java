package Strings_Examples;

public class CountTheRepeatedWord {

	public static void main(String[] args) {
		String str="India is a very large country, InDIa has high population, InDia has rich landscapes";
		
		//1st approch
		String[] arr=str.split(" ");
		int counter=0;
		
		for (String word : arr) {
			
			if(word.equalsIgnoreCase("india"))
			{
				counter++;				
			}
		}
System.out.println("The total word count is "+counter);



//2nd approach

str=str.toLowerCase();
String temp="";
counter=0;
for(int i=0;i<=str.length()-1;i++)
{
	char c=str.charAt(i);
	temp=temp+c;
	if(Character.isWhitespace(c) && temp.contains("india"))
	{
		counter++;
		temp="";
	}
}

System.out.println("The total word count is "+counter);



	}
	

	
}
