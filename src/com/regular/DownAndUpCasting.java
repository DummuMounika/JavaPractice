package com.regular;

public class DownAndUpCasting {

	public static void main(String[] args) {
		double d = 4.5;
		int i = (int) d; //type casting
		System.out.println(i);
		
		//up casting
		//refer to A
		A obj = (A) new B(); //type casting with A class (superclass)
		obj.show1();
		
		//down casting
		//refer to A obj but type casting with child class(B)
		B obj1 = (B) obj;
		obj1.show2();

	}

}
