package com.revising.oopsconcept;

public class OOPS {
	public static void main(String[] args) {
		Pen pen1 = new Pen(); //instance of class
		pen1.color = "blue";
		pen1.type = "gel";
		pen1.write();
		pen1.printColor();
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.printColor();
		
		//constructor
		Student stud1 = new Student(); 
		stud1.name = "Mounika";
		stud1.age = 24;
		System.out.println("checking out the usage of default constructor");
		stud1.printInfo();
		
		Student stud2 = new Student("Venu",27);
		System.out.println("checking out the usage of parameterized constructor");
		stud2.printInfo();
		stud2.name = "Akhi";
		stud2.age = 22;
		System.out.println("checking out the usage of overwriting parameterized constructor");
		stud2.printInfo();
		
		Student stud3 = new Student(stud2);
		System.out.println("checking out the usage of copy constructor");
		stud3.printInfo();
		
		//polymorphism (overloading method)
		System.out.println("checking out the usage of overloading method");
		stud3.printInfo(stud2.age);
		stud3.printInfo(stud2.name);
		stud3.printInfo(stud2.name,stud2.age);
		
		//Abstraction
		Horse horse = new Horse();
		horse.walk();
		//Animal animal = new Animal(); //abstract cannot be instantiate
		
		Student.school = "SAU";
		System.out.println(stud1.school);

	}

}
