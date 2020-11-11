package com.main;

import java.util.Scanner;

import com.pojo.Mycalculator;

public class InterfaceAdvancedArthmeticMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter the number :");
		number = scanner.nextInt();
		Mycalculator calculator = new Mycalculator();
		int n = calculator.divisor_sum(number);
		System.out.println("I implemented: AdvancedArithmetic \n" + n);
		calculator = null;
		scanner.close();

	}

}
