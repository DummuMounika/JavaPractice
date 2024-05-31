package com.regular;
class Calculator  //class have methods and variables
{ 

	int a; //instance variable/global
	
	public Calculator(int a) { // argumented constructor
		this.a = a;
	}

	public int add(int a,int b) //Methods
	{
		int r = this.a+b;
		System.out.println("Added");
		return r;
	}
}

public class ClassAndObject {

	public static void main(String[] args) { //main method
		int num1 = 13;
		int num2 = 25;
		
		Calculator calc = new  Calculator(10); //creating a object //constructor
		
		int result = calc.add(num1,num2);
		
		System.out.println(result);
		
	}
}
