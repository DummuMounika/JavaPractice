package com.regular;

public class A {
	
	
	int marks = 6;
	
	//Here super is calling Object class constructor
	public A() {
		System.out.println("In A:Default constructor");
	}
	
	public A(int n) {
		System.out.println("In A int: Parameterized constructor");
	}
	
	public void show() {
		System.out.println("in A show");
	}
	
	public void config() {
		System.out.println("in A config");
	}
	
	public void show1() {
		System.out.println("in A show");
	}
	
}
