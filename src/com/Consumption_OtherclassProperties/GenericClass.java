package com.Consumption_OtherclassProperties;

public class GenericClass {
	
	
	public static void launchApplication()
	{
		
		System.out.println("Launching Application");
	}
	
	public static void verifyHomePage()
	{
		
		System.out.println("Verifying Home page");
	}
	
	public static void hoverAndClick(String mainlink,String sublink)
	{
		
		System.out.println("hovering on the "+mainlink);
		
		System.out.println("hovering on the "+sublink);
	}
	
	public static String registerUser()
	{
		
		System.out.println("Registering user");
		
		System.out.println("Completed Registration");
		
		return "user01";
	}
	
	
	public static void verifyQuickNotes()
	{
		System.out.println("Verified QuickNotes");
	}
	

}
