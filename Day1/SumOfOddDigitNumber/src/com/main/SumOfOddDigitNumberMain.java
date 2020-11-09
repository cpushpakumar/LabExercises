package com.main;

import java.util.Scanner;

import com.services.SumOfOddDigitNumber;

public class SumOfOddDigitNumberMain {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number:");
		number = scanner.nextInt();
		SumOfOddDigitNumber findodddigitsum = new SumOfOddDigitNumber();

		int sum = findodddigitsum.findOddDigitSum(number);
		if (sum % 2 == 0) {
			System.out.println("Sum of odd digits is even.");
		} else {
			System.out.println("Sum of odd digits is odd");
		}
		scanner.close();

	}

}
