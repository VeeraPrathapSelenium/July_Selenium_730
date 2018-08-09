package Strings;

public class Split {
	public static void main(String[] args) {
		
		String str="India,America,Jarkand";
		
		
		String [] arr=str.split(",");
		
		for (String item : arr) {
			System.out.println(item);
		}
		
		
		
	}
}
