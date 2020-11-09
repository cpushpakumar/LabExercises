package com.main;

import java.util.Scanner;

import com.services.MethodForSmallestNumber;

public class MethodForSmallestNumberMain {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number\n");
		number1 = scanner.nextInt();
		System.out.print("Enter the second number\n");
		number2 = scanner.nextInt();
		System.out.print("Enter the Third number\n");
		number3 = scanner.nextInt();
		MethodForSmallestNumber method = new MethodForSmallestNumber();
		method.smallestNumber(number1, number2, number3);
		scanner.close();
	}

}
