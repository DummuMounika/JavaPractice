package com.regular.practise;
//Exception errors are the runtime error
public class TestExceptionCases {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		try
		{
			j = 18/i;
		}catch(ArithmeticException e) {
			System.out.println("Something went wrong.."+e);
		}
		
		System.out.println(j);
		System.out.println("Bye");
		
	}

}
