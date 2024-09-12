package com.regular;

public class B extends A{
	
	private int marks= 8;
	
	public B() {
		super(); 
		//super(5);
		System.out.println("In B:Default constructor");
	}
	
	public B(int n) {
		//super();  //super method executes the super class constructor
		this();  //this method executes the present class constructor
		System.out.println("In B int: Parameterized constructor");
	}
	
	public void show() {
		super.show();
		System.out.println("In B show");
	}
	
	public void show2() {
		System.out.println("in B show");
	}
	
	public int setMarks() {
		 super.marks = this.marks;
		 return super.marks;
	}
	
	public int superMarks() {
		return super.marks;
	}
	
	
	
}
