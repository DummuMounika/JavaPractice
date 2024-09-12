package com.regular;
class Mobile {
	String brand;  //instance variable
	int price;     //instance variable
	static String name;   //common to all the object//class member
	
	public void show() {
		System.out.println(brand + " : " + price +" : " + name);
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "Smartphone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samasung";
		obj2.price = 1700;
		Mobile.name = "Smartphone";
		
		Mobile.name = "Phone";
		obj1.show();
		obj2.show();
	}

}
