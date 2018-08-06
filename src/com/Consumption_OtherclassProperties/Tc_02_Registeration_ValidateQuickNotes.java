package com.Consumption_OtherclassProperties;

public class Tc_02_Registeration_ValidateQuickNotes {

	public static void main(String[] args) {
		
	
		GenericClass genobj=new GenericClass();
		
		genobj.launchApplication();
	
		genobj.verifyHomePage();
	
		genobj.hoverAndClick("Register", "Employer");
		String username=genobj.registerUser();
		
		System.out.println("User Re3gistration is comleted and the username is "+username);
	
	
	
	
	}

}
