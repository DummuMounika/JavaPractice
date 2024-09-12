package com.regular;

public class StaticBlock {

	public static void main(String[] args) {
		
		Mobile3 obj1 = new Mobile3();
		obj1.brand = "Apple";
		obj1.price = 1500;
		
		Mobile3.name = "Smartphone";
		
		Mobile3 obj2 = new Mobile3();
		
		obj1.show();
		obj2.show();
		
		Mobile3.staticShow(obj1);
	}

}
