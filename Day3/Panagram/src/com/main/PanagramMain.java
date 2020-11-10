/*Write a program to find the given string is pangram or not.
(Hint: Pangrams are words or sentences containing every letter of the alphabet at least once)
Sample Input
The quick brown fox jumps over the lazy dog sp.
Sample Output:
Pangram*/

/**
 * @author Pushpa Kumar Reddy
 */


package com.main;

import java.util.Scanner;

import com.services.Panagram;

public class PanagramMain {

	public static void main(String[] args) {
		String word;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word :");
		word=scanner.nextLine();
		Panagram panagram=new Panagram();
		panagram.stringPanagram(word);
		scanner.close();
		

	}

}
