package com.regular.practise;
//Aggregation

class Operation {
	public int square(int n) {
		return n*n;
	}
}

class Circle {
	Operation op;//aggregation
	double pi = 3.14;
	
	public Circle() {
		op = new Operation();
	}
		
	public double area(int radius) {	
		int rsquare = op.square(radius);
		return pi * rsquare;
	}	
}

public class HasARelation {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println(c.op.square(3));
		double result = c.area(5);
		System.out.println(result);

	}

}
