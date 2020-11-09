package com.main;

import java.util.Scanner;

import com.services.TryCatch;

public class TryCatchMain {

	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		number1 = scanner.nextInt();
		System.out.println("Enter the second number: ");
		number2 = scanner.nextInt();
		TryCatch exceptionhandle = new TryCatch();
		exceptionhandle.exceptionHandle(number1, number2);
		scanner.close();

	}

}
