package com.main;

import java.util.Scanner;

import com.services.AsciiValueOfCharacter;

public class AsciiValueOfCharacterMain {

	public static void main(String[] args) {
		char character;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter character: ");
		character = scanner.next().charAt(0);
		AsciiValueOfCharacter ascii = new AsciiValueOfCharacter();
		ascii.characterAscii(character);
		scanner.close();

	}

}
