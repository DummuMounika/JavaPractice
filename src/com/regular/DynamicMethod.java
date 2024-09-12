package com.regular;
//Runtime polymorphism is implemented using dynamic method dispatch.
//Dynamic method dispatch only works 
//when there is an inheritance relationship between the classes.
public class DynamicMethod {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();

	}

}
