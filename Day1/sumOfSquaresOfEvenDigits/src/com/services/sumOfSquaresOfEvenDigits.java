package com.services;

public class sumOfSquaresOfEvenDigits {
	public int squaresOffEven(int number) {
		int number1 = 0;
		int number2 = 0;
		while (number != 0) {
			number1 = number % 10;
			if ((number1 % 2) == 0)
				number2 += number1 * number1;
			number /= 10;
		}
		return number2;

	}

}
