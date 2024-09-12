package com.revising.oopsconcept;

abstract class Animal {
	abstract void walk();
	Animal(){
		System.out.println("You're creating a new animal");
	}
	public void eat() {
		System.out.println("Animal eats");
	}
}
