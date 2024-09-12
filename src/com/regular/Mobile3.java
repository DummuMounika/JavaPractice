package com.regular;

public class Mobile3 {
	public String brand;  //instance variable
	public int price;
	public static String name;
	public static final float PI_VALUE = 3.14f;
	
	static {
		name = "Phone";
		System.out.println("in static block");
	}
	
	public Mobile3() {
		brand = "Samsung";
		price = 200;
		System.out.println("in constructor");
	}
	
	public void show() { //instance method
		System.out.println(brand + " : " + price +" : " + name);
	}
	
	public static void staticShow(Mobile3 obj) { //instance method
		System.out.println(obj.brand + " : " + obj.price +" : " + name);

	}
	
	
	
}
