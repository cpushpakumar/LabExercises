package com.services;

public class MyCalculator {
	public long power(int x, int y) throws Exception {
		if (x < 0 || y < 0) {
			throw new Exception("n and p should be non-negative");
		}
		if (x == 0 || y == 0) {
			throw new Exception("n and p should not be zero");
		}
		return (int) Math.pow((double) x, (double) y);

	}

}
