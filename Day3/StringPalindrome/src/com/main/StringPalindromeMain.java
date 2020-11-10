/*Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise.
Sample Input
madam
Sample Output
Yes*/

/**
 * @author Pushpa Kumar Reddy
 */


package com.main;

import java.util.Scanner;

import com.services.StringPalindrome;

public class StringPalindromeMain {

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		word = scanner.nextLine();

		StringPalindrome palindrome = new StringPalindrome();
		String word1 = palindrome.palindrome(word);
		System.out.println("The Palindrome of " + word + " is: \n" + word1);
		scanner.close();

	}

}
