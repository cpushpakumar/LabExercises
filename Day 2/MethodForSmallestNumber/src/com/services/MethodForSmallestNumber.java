package com.services;

public class MethodForSmallestNumber {
	public static int smallestNumber(int number1, int number2, int number3) {
		if (number1 <= number2 && number1 <= number3) {
			System.out.println(number1 + " is the smallest number");

		} else if (number2 <= number1 && number2 <= number3) {
			System.out.println(number2 + " is the smallest number");

		} else {
			System.out.println(number3 + " is the smallest number");

		}
		return 0;

	}

}
