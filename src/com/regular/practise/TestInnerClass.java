package com.regular.practise;
//Class inside the class
public class TestInnerClass {

	public static void main(String[] args) {
		//A obj = new A();
		//Inner class
		
		//obj.show();	
		//A.B1 obj1 = obj.new B1();
		//A.B1 obj1 = new A.B1();
		//obj1.config();
		
		//Anonymous class
		
		A obj = new A() {
			public void show() {
				System.out.println("in new show");
			}
		};
		obj.show();
		
	}

}
