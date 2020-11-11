package com.pojo;

public class Mycalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				sum += i;
		}
		return sum;
	}

}
