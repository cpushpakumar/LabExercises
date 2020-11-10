package com.main;

import java.util.Scanner;

import com.services.SubstringFromRange;

public class SubstringFromRangeMain {

	public static void main(String[] args) {
		String word;
		int index1;
		int index2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		word = scanner.nextLine();
		System.out.println("Enter first index :");
		index1 = scanner.nextInt();
		System.out.println("Enter second index :");
		index2 = scanner.nextInt();
		SubstringFromRange substring = new SubstringFromRange();
		String word1 = substring.stringFromRange(word, index1, index2);
		System.out.println("The word " + word + " from index " + index1 + " to index " + index2 + " is :" + word1);
		scanner.close();

	}

}
