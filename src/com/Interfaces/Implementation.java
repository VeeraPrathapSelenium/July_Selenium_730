package com.Interfaces;

public  class Implementation implements Login{

	@Override
	public  void sucessfullLogin() {
		System.out.println("Sucessfull login");
		
	}

	@Override
	public void invalidLogin() {
		System.out.println("Invalid login");
		
	}

	@Override
	public void resetPassword() {
		System.out.println("Reset Password");
		
	}

	@Override
	public void forgetPassword() {
		// TODO Auto-generated method stub
		
		
	}

	
	public  static void myownmethod()
	{
		System.out.println("Own Method");
	}

}
