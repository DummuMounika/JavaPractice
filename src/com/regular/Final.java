package com.regular;

//final variable gives the access for not updating.
//final method utilizes for not using over riding concept
//final class utilizes for not using the inheritance concept

public class Final {
	public static void main(String[] args) {
		final int num = 5; //final variable
		//num = 9;
		System.out.println(num);
		
		//final Method
		
		BankAccountNumber obj1 = new BankAccountNumber();
		obj1.show();

	}
}
