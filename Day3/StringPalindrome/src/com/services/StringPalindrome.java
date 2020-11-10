package com.services;

public class StringPalindrome {

	public String palindrome(String word) {
		String reverse = new StringBuffer(word).reverse().toString();
		if (reverse.equals(word)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		return reverse;

	}

}
