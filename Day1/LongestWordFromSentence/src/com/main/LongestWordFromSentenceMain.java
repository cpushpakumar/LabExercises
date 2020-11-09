package com.main;

import java.util.Scanner;

import com.services.LongestWordFromSentence;

public class LongestWordFromSentenceMain {

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word:");
		word = scanner.nextLine();
		String[] words = word.split("");
		LongestWordFromSentence longword = new LongestWordFromSentence();
		// String Sentence=longword.getLargestWord (words);
		// System.out.println("The longest word:"+Sentence);
		longword.getLargestWord(words);
		scanner.close();
	}

}
