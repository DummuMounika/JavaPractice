package com.regular.practise;
//Finally used for closing
public class TestTryFinally {
	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		try {
			j = 18/i;
			System.out.println("hello");
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}finally {
			System.out.println("Bye");
		}
		
	}
}
