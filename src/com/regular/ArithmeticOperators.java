package com.regular;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 6;
		int num2 = 3;
		
		//Arithmetic Operator
		int result1 = num1 + num2; //Addition
		int result2 = num1 - num2; //Subtraction
		int result3 = num1 / num2; //Divide
		int result4 = num1 % num2; //Modulus
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		num1 ++; //post- increment
		System.out.println(num1);
		++ num1; //pre-increment
		System.out.println(num1);
		num1 --; //post- decrement
		System.out.println(num1);
		--num1 ; //pre-decrement
		System.out.println(num1);
		
		

	}

}
