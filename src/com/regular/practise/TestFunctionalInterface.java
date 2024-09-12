package com.regular.practise;
//@FunctionalInterface
//lambda expressions works with functionalInterface
interface A3{
	int add(int i, int j);
}

public class TestFunctionalInterface {

	public static void main(String[] args) {
		A3 obj = (i,j) ->  i+j;
		
		int result = obj.add(3,4);
		System.out.println(result);
	}

}
