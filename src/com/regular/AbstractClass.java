package com.regular;
//cannot create object for abstract class
//Declaring an abstract method means it is only declared,
//not defined, and must be implemented by concrete subclasses.

//Concrete subclasses must override and implement all abstract methods from the parent abstract class.
public class AbstractClass {

	public static void main(String[] args) {
		//Car obj = new Car();
		//Car obj = new BMW();
		Car obj = new UpdatedBMW();
		obj.drive();
		obj.playMusic();
		obj.fly();

	}

}
