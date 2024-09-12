package com.regular;

class Mobile1 {
	String brand;  //instance variable
	int price;
	static String name="monu";
	
	public void show() { //instance method
		System.out.println(brand + " : " + price +" : " + name);
	}
	
	public static void show1(Mobile1 obj) { //Static method
		System.out.println("In static method");
		System.out.println(obj.brand + " : " + obj.price +" : " + name);
	}
	
	public static void test() {
		System.out.println("Hello Mounika...");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		
		/*Mobile1 obj1 = new Mobile1();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile1.name = "Smartphone";
		
		Mobile1 obj2 = new Mobile1();
		obj2.brand = "Samasung";
		obj2.price = 1700;
		
		obj1.show();
		
		
		Mobile1.name = "LG";
		obj2.show();
		
		Mobile1.show1(obj1);*/
		
		
		Mobile1.test();
		System.out.println(Mobile1.name);
	}

}
