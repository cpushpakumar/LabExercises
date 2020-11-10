//1. Write a Java program to convert all the characters in a string to lowercase.

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.services.ConvertToLowerCase;

public class ConvertToLowerCaseMain {

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		word = scanner.nextLine();
		ConvertToLowerCase lowercase = new ConvertToLowerCase();
		String word1 = lowercase.lowerCase(word);
		System.out.println("The lower case of " + word + " is: \n" + word1);
		scanner.close();

	}

}
