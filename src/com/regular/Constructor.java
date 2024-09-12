package com.regular;

public class Constructor {

	public static void main(String[] args) {
	    Human obj1 = new Human();
	    Human obj2 = new Human(27,"VenuGopal");
		System.out.println(obj1.getName() + ":" + obj1.getAge());
		System.out.println(obj2.getName() + ":" + obj2.getAge());
		obj1.setAge(23);
		obj1.setName("Monu"); 
		System.out.println(obj1.getName() + ":" + obj1.getAge());
		System.out.println(obj2.getName() + ":" + obj2.getAge());
		
		//Anonymous Object
		new Human(); 
		new Human().setName("Akhila");
	}

}
