package com.main;

import java.util.Scanner;

import com.services.VowelsCount;

public class VowelsCountMain {

	public static void main(String[] args) {
		// CharInaString c=new CharInaString();
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		word = scanner.nextLine();
		VowelsCount vowelscount = new VowelsCount();
		// char vowel = vowelscount.vowelsInString(word);
		vowelscount.vowelsInString(word);
		// System.out.println("Vowels in a string are :" + vowel);
		scanner.close();

	}

}
