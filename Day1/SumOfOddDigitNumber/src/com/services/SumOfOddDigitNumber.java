package com.services;

public class SumOfOddDigitNumber {
	public static int findOddDigitSum(int number) {
		int lastDigit = 0;
		int max = 0;
		while (number != 0) {
			lastDigit = number % 10;
			if (lastDigit % 2 != 0) {
				max += lastDigit;
			}
			number = number / 10;
		}
		return max;

	}

}
