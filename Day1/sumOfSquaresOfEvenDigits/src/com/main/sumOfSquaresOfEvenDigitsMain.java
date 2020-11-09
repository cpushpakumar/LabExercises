package com.main;

import java.util.Scanner;

import com.services.sumOfSquaresOfEvenDigits;

public class sumOfSquaresOfEvenDigitsMain {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = scanner.nextInt();
		sumOfSquaresOfEvenDigits sumoffsquaresofevendigits = new sumOfSquaresOfEvenDigits();
		int sum = sumoffsquaresofevendigits.squaresOffEven(number);
		System.out.println("The sum of squares off even digit is:" + sum);
	}

}
