package com.revising.oopsconcept;

class Student{
	String name;
	int age;
	static String school;
	
	public void printInfo() {
		System.out.println(this.name); //this refers to particular class
		System.out.println(this.age);
	}
	
	Student(){ //Default Constructor
		System.out.println("constructor is called first");
	}
	
	Student(String name,int age){ //Parameterized constructor
		this.age = age;
		this.name = name; //this.age is object age and age is parameter which is defined in this constructor
	}
	
	Student(Student s2){ //copy constructor
		this.name = s2.name;
		this.age = s2.age;
	}
	
	//polymorphism concepts
	//overloading
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}
}