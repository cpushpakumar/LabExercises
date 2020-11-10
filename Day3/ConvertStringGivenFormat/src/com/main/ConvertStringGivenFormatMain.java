/*Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.
Create a class UserMainCode with a static method reshape which accepts a string and a character. The return type (String) should return the final string.
Create a Class Main which would be used to accept a string and a character, and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and a character.
Output consists of a string (the final string).
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.services.ConvertStringGivenFormat;

public class ConvertStringGivenFormatMain {

	public static void main(String[] args) {
		String word;
		// String character;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word:");
		word = scanner.nextLine();
		// System.out.println("Enter the Character :");
		// character = scanner.next();
		ConvertStringGivenFormat convert = new ConvertStringGivenFormat();
		String word1 = convert.stringReverse(word);
		System.out.println("The word " + word + "after modifications :" + word1);
		scanner.close();

	}

}
