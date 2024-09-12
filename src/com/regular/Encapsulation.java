package com.regular;

public class Encapsulation {

	public static void main(String[] args) {
		
		Human obj = new Human();
		System.out.println(obj.getName() + ":" + obj.getAge());
		
		obj.setAge(23);
		obj.setName("Monu"); 
		System.out.println(obj.getName() + ":" + obj.getAge());
		

	}

}
