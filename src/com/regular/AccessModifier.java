package com.regular;

public class AccessModifier {

	public static void main(String[] args) {
		Person obj = new Person();
		System.out.println("Name: " +obj.fname + " " +obj.lname);
		System.out.println("Email: " +obj.email);
		System.out.println("Age: " +obj.age);
		
		System.out.println("Name: " +obj.fname1 + " " +obj.lname1);
		System.out.println("Email: " +obj.email1);
		System.out.println("Age: " +obj.age1);
		
		System.out.println("Name: " + obj.getFname2() + " " +obj.getLname2());
		System.out.println("Email: " + obj.getEmail2());
		System.out.println("Age: " + obj.getAge2());
	}

}
