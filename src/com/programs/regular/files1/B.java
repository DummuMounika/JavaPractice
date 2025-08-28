package com.programs.regular.files1;

public class B extends A {
	public B() {
		super();
		System.out.println("child class constructor invoked");
	}
	public B(int a) {
		super();
		System.out.println("child class constructor invoked"+a);
	}
	
	{
		System.out.println("instance initializer block is invoked");
	}
	
	

}
