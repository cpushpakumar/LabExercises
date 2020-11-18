package com.main;

import java.util.Scanner;

import com.pojo.CalculateRunRate;

public class CalculateRunRateMain {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input :");

		while (scanner.hasNextInt()) {
			double runscored = scanner.nextInt();
			double totaloverfaced = scanner.nextInt();
			CalculateRunRate calculaterunrate = new CalculateRunRate();
			try {
				double currentrunrate = calculaterunrate.runrate(runscored, totaloverfaced);
				System.out.println(currentrunrate);
			} catch (Exception e) {
				System.out.println(e);

			}
		}
		scanner.close();

	}

}
