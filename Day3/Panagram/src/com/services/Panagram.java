package com.services;

public class Panagram {
	public void stringPanagram(String word) {
		boolean[] alphaList = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				index = word.charAt(i) - 'A';
			} else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
				index = word.charAt(i) - 'a';
			}
			alphaList[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (alphaList[i] == false)
				flag = 0;
		}
		if (flag == 1)
			System.out.print("\nThe above string is a pangram.");
		else
			System.out.print("\nThe above string is not a pangram.");
	}

}
