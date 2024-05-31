package com.regular;

public class ConditionalStatement {
	public static void main(String[] args) {
		int x = 18;
		int y = 45;
		int z = 56;
		//curly braces are required when we have multiple statements
		if (x > y && x > z){
			System.out.println(x);
			System.out.println("Thankyou");
		}
		else if(y > x && y > z){
			System.out.println(y);
		}
		else
			System.out.println(z); 
	}

}
