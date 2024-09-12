package com.regular;

public class ClassAndObject {

	public static void main(String[] args) { //main method
		int num1 = 13;
		int num2 = 25;
		
		Calculator calc = new Calculator(10); //creating a object //constructor
		
		int result = calc.add1(num1,num2);
		
		System.out.println(result);
		
	}
}
