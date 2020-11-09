package com.main;

import java.util.Scanner;

import com.services.SwapTwoNumbers;

public class SwapTwoNumbersMain {

	public static void main(String[] args) {
		double number1;
		double number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Num :");
		number1 = scanner.nextDouble();
		System.out.println("Enter Second Num :");
		number2 = scanner.nextDouble();
		SwapTwoNumbers swaptwonumbers = new SwapTwoNumbers();
		swaptwonumbers.swap(number1, number2);
		scanner.close();
	}

}
