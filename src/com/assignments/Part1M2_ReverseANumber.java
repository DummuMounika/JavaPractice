package com.assignments;

public class Part1M2_ReverseANumber {
	public static int reverse(int givenNumber) {
		int reversedNumber = 0;
		while(givenNumber != 0) {
			int digit = givenNumber % 10;
			reversedNumber = reversedNumber * 10 + digit;
			givenNumber = givenNumber/10;
		}
		return reversedNumber;
	}

}
