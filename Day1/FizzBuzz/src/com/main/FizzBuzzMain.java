package com.main;

import java.util.Scanner;

import com.services.FizzBuzz;

public class FizzBuzzMain {

	public static void main(String[] args) {
		int number1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Num :");
		number1 = obj.nextInt();
		FizzBuzz fizzbuzz=new FizzBuzz();
		fizzbuzz.multiplesOf3569(number1);
		obj.close();
	}

}
