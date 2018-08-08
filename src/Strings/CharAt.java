package Strings;

public class CharAt {

	public static void main(String[] args) {
		String str="Hello india";
		
		System.out.println(str.charAt(1));
		
		int vowels=0;
		int cons=0;
		//Print each character from string
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			char c=str.charAt(i);
			
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels++;
			}else if(! Character.isWhitespace(c))
			{
				cons++;
			}
		}
		
		
		System.out.println("The total number of vowels are "+vowels);
		
		System.out.println("The total number of consonants are "+cons);
		
		
		
		
		
		int j=0;
		
		System.out.println("********************** While Loop ********************");
		
		while(j<=str.length()-1)
		{
			System.out.println(str.charAt(j));
			j++;
			
		}
		
int m=0;
		
		System.out.println("**********************Do While Loop ********************");
		
		do {
			System.out.println(str.charAt(m));
			m++;
		} while (m<=str.length()-1);
		
		
		System.out.println("********************** Reverse Order********************");
		for(int i=str.length()-1;i>=0;i--)
		{
			
			System.out.println(str.charAt(i));
		}

	}
	
	
	

}
