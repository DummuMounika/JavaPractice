package com.revising.oopsconcept;

public class Bank {
	public static void main(String args[]) {
		Account a1 = new Account();
		a1.name = "Sau";
		a1.email = "sau.mag.com";
		a1.getpassword();
		a1.setpassword("abc");
		System.out.println(a1.getpassword());
	}
}	
