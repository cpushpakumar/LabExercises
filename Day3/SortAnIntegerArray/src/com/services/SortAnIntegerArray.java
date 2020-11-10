package com.services;

public class SortAnIntegerArray {
	public void sort(int count, int num[]) {
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		System.out.print("Array Elements in Ascending Order: ");
		for (int i = 0; i < count - 1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print(num[count - 1]);
	}
}
