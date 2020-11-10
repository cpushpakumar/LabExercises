//write a Java program to search for an element of an integer array of 10 elements.

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.services.SearchElementInArray;

public class SearchElementInArrayMain {

	public static <num> void main(String[] args) {
		int count, search;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		count = scanner.nextInt();
		int num[] = new int[count];
		System.out.println("Enter array elements:");
		for (int i = 0; i < count; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.println("Enter the element to search :");
		search = scanner.nextInt();
		SearchElementInArray elementsearch = new SearchElementInArray();
		elementsearch.elementSearch(count, num, search);
		scanner.close();

	}

}
