package com.services;

public class ReturnModifiedString {

	public String stringModify(String word) {
		if (word.length() > 0) {
			if (word.substring(0, 1).equals("k") && !word.substring(1, 2).equals("b")) {
				return word.substring(0, 1) + word.substring(2, word.length());
			} else if (word.substring(1, 2).equals("b") && !word.substring(0, 1).equals("k")) {
				return word.substring(1, 2) + word.substring(2, word.length());
			} else if (word.substring(0, 1).equals("k") && word.substring(1, 2).equals("b")) {
				return word;
			} else {
				return word.substring(2, word.length());
			}
		} else {
			return "";
		}

	}

}
