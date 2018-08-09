package Strings_Examples;

public class PrintPatternWithAplhaBets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="SCHOOL";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			String val=str.substring(0, i+1);
			
			System.out.println(val);
			
		}
	}

}
