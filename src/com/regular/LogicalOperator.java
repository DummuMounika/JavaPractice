package com.regular;

public class LogicalOperator {
	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		int a = 4;
		int b = 7;
		
		boolean result = x > y && a > b ;  //AND operator
		boolean result1 = x > y || a > b ; //OR operator
		System.out.println(result);
		System.out.println(result1);
		System.out.println(!result1); //NOT operator
		
		
	}

}
