package Strings_Examples;

public class GenerateAPattern {

	public static void main(String[] args) {


		String str="*";
		
		String temp="";
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				temp=temp+str;
			}
			
			System.out.println(temp);
			temp="";
		}

	}

}
