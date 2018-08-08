package Strings;

public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String source="We are Learning Selenium";
		
		String findvalue="Selenium";
		
		String replacevalue="Selenium with java";
		
		
		source=source.replace(findvalue, replacevalue);
		
		System.out.println(source);
		
		
		source=source.replaceAll(" ", "");
				System.out.println(source);
		

	}

}
