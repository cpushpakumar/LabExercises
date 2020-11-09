package com.resources;

public class MiddleCharacterOfString {
	public static String characterOfStrings(String string) {
		int position;
		int length;
		if (string.length() % 2 == 0) {
			position = string.length() / 2 - 1;
			length = 2;
		} else {
			position = string.length() / 2;
			length = 1;
		}
		return string.substring(position, position + length);

	}

}
