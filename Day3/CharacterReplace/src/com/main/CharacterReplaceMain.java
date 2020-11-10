// Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.services.CharacterReplace;

public class CharacterReplaceMain {

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		word = scanner.nextLine();
		CharacterReplace character = new CharacterReplace();
		String word1 = character.replace(word);
		System.out.println("The replace of " + word + " is: \n" + word1);
		scanner.close();
	}

}
