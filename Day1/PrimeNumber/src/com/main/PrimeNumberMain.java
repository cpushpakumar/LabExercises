package com.main;

import java.util.Scanner;

import com.services.PrimeNumber;

public class PrimeNumberMain {

	public static void main(String[] args) {
		int number, flag;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		PrimeNumber prime = new PrimeNumber();
		prime.isprime(number);
		scanner.close();
	}

}
