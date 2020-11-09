package com.main;

import java.util.Scanner;

import com.resources.MiddleCharacterOfString;

public class MiddleCharacterOfStringMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
		String string = scanner.nextLine();
		MiddleCharacterOfString characterString = new MiddleCharacterOfString();
		String string2 = characterString.characterOfStrings(string);
		System.out.print("The middle character in the string: " + string2 + "\n");
		scanner.close();
	}

}
