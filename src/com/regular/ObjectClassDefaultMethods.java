package com.regular;
//he Object class provides several default methods, 
//including equals(), hashCode(), and toString().
public class ObjectClassDefaultMethods {

	public static void main(String[] args) {
		
		Laptop obj = new Laptop();
		obj.model = "HP";
		obj.price = 60000;
		
		Laptop obj1= new Laptop();
		obj1.model = "HP";
		obj1.price = 60000;
		//printing the obj-behind it will call toString method
		//System.out.println(obj.toString());

		System.out.println(obj);
		
		boolean result = obj.equals(obj1);
		System.out.println(result);
		
	}

}
