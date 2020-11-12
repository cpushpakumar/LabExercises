package com.services;

public class OddEvenString {
	public void stringOddEven(String word, char stringEven[], char stringOdd[]) {
		for (int i = 0; i < word.length(); i++) {
			int even = 0;
			int odd = 0;
			for (int j = 0; j < word.length(); j++) {

				if (j % 2 == 0) {
					stringEven[even] = word.charAt(j);
					even++;
				}
				if (j % 2 == 1) {
					stringOdd[odd] = word.charAt(j);
					odd++;
				}
			}

		}

		System.out.print(stringEven);
		System.out.print(" \n");
		System.out.println(stringOdd);

		
	}

}
