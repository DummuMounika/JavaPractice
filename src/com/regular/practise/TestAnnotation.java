package com.regular.practise;
@FunctionalInterface
interface A1{
	//void show();
	//void run();
	void show(int i);
} 
public class TestAnnotation {
	public static void main(String[] args) {
		//Anonymous Inner class
//		A1 obj = new A1() {
//			public void show() {
//				System.out.println("in show");
//			}
//		};
		//lambda
//		A1 obj  = () ->
//		{
//			System.out.println("in show");
//		};
		//lambda expression
//		A1 obj  = () ->		System.out.println("in show");
//		
		//obj.show();
		
		
		
		/*
		 * A1 obj = i -> System.out.println("in show " + i); obj.show(4);
		 */
		
		
		
		A1 obj = (int i) ->  System.out.println("in show");
		
		obj.show(10);
	}	
}
