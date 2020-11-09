package com.main;

import java.util.Scanner;

import com.services.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Num :");
		number1 = obj.nextInt();
		System.out.println("Enter Second Num :");
		number2 = obj.nextInt();
		Calculator add = new Calculator();
		Calculator sub = new Calculator();
		Calculator mul = new Calculator();
		Calculator div = new Calculator();
		Calculator rem = new Calculator();
		System.out.println("1. Addition /n 2. Substraction/n 3. Multiplcation /n 4. Divide /n 5.Remainder ");
		try (Scanner input = new Scanner(System.in)) {
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				add.addition(number1, number2);
				break;
			case 2:
				sub.subtraction(number1, number2);
				break;
			case 3:
				mul.multiplication(number1, number2);
				break;
			case 4:
				div.division(number1, number2);
				break;
			case 5:
				rem.modules(number1, number2);
				break;
			}
		}
		obj.close();
	}

}
