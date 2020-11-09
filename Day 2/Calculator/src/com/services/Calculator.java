package com.services;

public class Calculator {

	public void addition(int x, int y) {
		System.out.println("The addition of two numbers is :\n" + (x + y));
		return;
	}

	public void subtraction(int x, int y) {
		System.out.println("The subtraction of two numbers is :\n" + (x - y));
		return;
	}

	public void multiplication(int x, int y) {
		System.out.println("The multiplication of two numbers is :\n" + (x * y));
		return;
	}

	public void division(int x, int y) {
		System.out.println("The division of two numbers is :\n" + (x / y));
		return;
	}
	
	public void modules(int x, int y) {
		System.out.println("The remainder of two numbers is :\n" + (x % y));
		return;
	}
}
