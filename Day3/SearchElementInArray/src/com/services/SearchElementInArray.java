package com.services;

public class SearchElementInArray {
	public void elementSearch(int count, int num[], int search) {
		int flag = 0;
		for (int i = 0; i < count; i++) {
			if (num[i] == search) {
				System.out.println("Element " + search + " found at " + i + " position");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Element " + search + " not found");
		}
	}

}
