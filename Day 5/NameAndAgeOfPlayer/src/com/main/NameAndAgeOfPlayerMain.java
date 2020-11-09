package com.main;

import java.util.Scanner;

import com.services.NameAndAgeOfPlayer;

public class NameAndAgeOfPlayerMain {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name :");
		name = scanner.nextLine();
		System.out.println("Enter age :");
		age = scanner.nextInt();
		NameAndAgeOfPlayer eligibletoparticipate = new NameAndAgeOfPlayer();
		try {
			eligibletoparticipate.eligibleToParticipate(name, age);
			System.out.println("Enter the Player Name :\n"+name+"\n"+"Player Age :\n"+age);
		} catch (Exception e) {
			e.printStackTrace();
		}

		scanner.close();
	}

}
