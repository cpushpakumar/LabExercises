package com.services;

public class SwapTwoNumbers {
	public void swap(double x, double y) {
		double temp = x;
		x = y;
		y = temp;
		System.out.println("The Swapping of two numbers is :\n" + x + "   " + y);

	}

}
