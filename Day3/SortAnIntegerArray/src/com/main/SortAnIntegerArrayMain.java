//write a Java program to sort an integer array of 10 elements in ascending

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.services.SortAnIntegerArray;

public class SortAnIntegerArrayMain {

	public static <num> void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		count = scanner.nextInt();
		int num[] = new int[count];
		System.out.println("Enter array elements:");
		for (int i = 0; i < count; i++) {
			num[i] = scanner.nextInt();
		}
		SortAnIntegerArray sortarray = new SortAnIntegerArray();
		sortarray.sort(count, num);
		scanner.close();

	}

}
