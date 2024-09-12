package com.assignments;

public class Part1M1_IntegerPower {
	public static int integerPower(int baseNumber, int exponentNumber) {
		int finalValue = 1;
		for (int i = 0; i < exponentNumber; i++) {
			finalValue = finalValue * baseNumber;
		}
		return finalValue;
	}
}
