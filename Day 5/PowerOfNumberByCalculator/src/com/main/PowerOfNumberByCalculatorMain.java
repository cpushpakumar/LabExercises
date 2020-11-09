package com.main;

import java.util.Scanner;

import com.services.MyCalculator;

public class PowerOfNumberByCalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number :");

		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			System.out.println("Enter the second number :");
			int p = scanner.nextInt();
			MyCalculator mycalculator = new MyCalculator();
			try {
				System.out.println("The power of " + n + " " + p + " is" + mycalculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		scanner.close();

	}
}
