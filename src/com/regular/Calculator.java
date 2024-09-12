package com.regular;

//Calculator - parent class and super class
public class Calculator  //class have methods and variables
{ 

	int a; //instance variable or global
	
	public Calculator() { // Default constructor
		System.out.println("In Default Constructor");
	}
	
	public Calculator(int a) { // Argument constructor
		this.a = a;
	}

	public int addNumberToGlobal(int b) //Methods
	{
		this.a = this.a + b;
		return this.a;
		
	}
	
	public int subNumberToGlobal(int b) //Methods
	{
		int r = this.a-b;
		System.out.println("Subtracted");
		return r;
	}
	
	public int add1(int a,int b) //Methods
	{
		int r = a+b;
		System.out.println("Added");
		return r;
	}
	
	public int sub1(int a,int b) //Methods
	{
		int r =a-b;
		System.out.println("Subtracted");
		return r;
	}
}
