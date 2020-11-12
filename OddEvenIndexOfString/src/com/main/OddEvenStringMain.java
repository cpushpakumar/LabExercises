package com.main;

import java.util.Scanner;

import com.services.OddEvenString;

public class OddEvenStringMain {

	public static void main(String[] args) {
		String word;
		char stringEven[] = new char[100];
		char stringOdd[] = new char[100];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		word = scanner.nextLine();
		OddEvenString evenodd = new OddEvenString();
		evenodd.stringOddEven(word, stringEven, stringOdd);
		// System.out.println("The word is :");
		scanner.close();
		word=null;

	}

}
