package com.regular.practise;

public class TestNestedTryBlock {
	public static void main(String[] args) {
		//outer try block
		try {
			//inner try block 1
			try {
				System.out.println("going to divide by 0");
				int b = 39/0;
			}catch(ArithmeticException e) { //catch block of inner try block 1
				System.out.println(e);
			}
			//inner try block 2
			try {
				int a[] = new int[5];
				a[5] = 6;
			}catch(ArrayIndexOutOfBoundsException e) { //catch block of inner try block 2
				System.out.println(e);	
			}
			System.out.println("other statement");
		}catch(Exception e) {
			System.out.println("handled the exception (outer catch)");
		}
		
		System.out.println("normal flow");
			
	}
}
