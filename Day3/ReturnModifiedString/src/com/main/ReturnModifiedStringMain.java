/*Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 characters except when
a. Keep the first char if it is 'k'
b. Keep the second char if it is 'b'.
Create a class UserMainCode with a static method getString which accepts a string and the return type (string) should be the modified string based on the above rules. Consider all letters in the input to be small case.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a string.
Sample Input 1:
hello
Sample Output 1:
llo
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.services.ReturnModifiedString;

public class ReturnModifiedStringMain {

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		word = scanner.nextLine();
		ReturnModifiedString returnmodified = new ReturnModifiedString();
		String word1 = returnmodified.stringModify(word);
		System.out.println("The word " + word + " after modifications is :" + word1);
		scanner.close();

	}

}
