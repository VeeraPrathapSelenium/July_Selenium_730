package com.Consumption_OtherclassProperties;

public class Tc_01_RegisterUser {

	public static void main(String[] args) {
		
	
		GenericClass genobj=new GenericClass();
		
		genobj.launchApplication();
	
		genobj.verifyHomePage();
	
		genobj.hoverAndClick("Register", "Employer");
		genobj.verifyQuickNotes();
	
	
	
	}

}
