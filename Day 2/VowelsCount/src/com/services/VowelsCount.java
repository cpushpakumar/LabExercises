package com.services;

public class VowelsCount {
	public static void vowelsInString(String word) {
		// char ch;
		int vCount = 0;
		for (int j = 0; j < word.length(); j++) {
			char ch = word.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				vCount++;

			}

		}
		System.out.println("Vowels in a string :" + vCount);

	}
}
