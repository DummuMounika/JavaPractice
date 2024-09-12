package com.regular;
//Wrapper class provides additional functionality beyond the 
//basic primitive types(int, float,char, string)

//Auto boxing -  automatically converts a primitive value to its corresponding wrapper class object.
//Auto unboxing - automatically converts a wrapper class object back to its primitive value.
public class WrapperClass {

	public static void main(String[] args) {
		
		int num = 5;
		//Integer num1 = new Integer(8);  // Boxing
		Integer num1 = num; //auto boxing
		//Integer num1 = 9;
		
		//int num2 = num1.intValue();  //unboxing
		int num2 = num1; //auto -unboxing
		
		//System.out.println(num1);
		System.out.println(num2);
		
		
		String str = "12";
		int num3 = Integer.parseInt(str);
		System.out.println(num3 * 2);
		

	}

}
