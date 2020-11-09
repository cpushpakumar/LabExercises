package com.main;

import java.util.Scanner;

import com.services.AverageOf3Numbers;

public class AverageOf3NumbersMain {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Num :");
		number1 = scanner.nextInt();
		System.out.println("Enter Second Num :");
		number2 = scanner.nextInt();
		System.out.println("Enter Third Num :");
		number3 = scanner.nextInt();
		AverageOf3Numbers average = new AverageOf3Numbers();
		average.average(number1, number2, number3);
		scanner.close();

	}

}
