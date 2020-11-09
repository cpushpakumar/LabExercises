package com.services;

import java.util.InputMismatchException;

public class TryCatch {
	public void exceptionHandle(int x, int y) {
		try {
			try {
				System.out.println("" + (x / y));
			} catch (InputMismatchException e) {
				System.out.println("java.util.InputMismatchException");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
