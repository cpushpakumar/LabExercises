package com.main;

import java.util.Scanner;

import com.services.VarargsSimpleAddition;

public class VarargsSimpleAdditionMain {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		VarargsSimpleAddition numberPattern = new VarargsSimpleAddition();
		numberPattern.add(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),
				scan.nextInt());
		scan.close();

	}
}
