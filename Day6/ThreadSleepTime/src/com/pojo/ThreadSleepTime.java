package com.pojo;

import java.util.Date;

public class ThreadSleepTime extends Thread {

	private String threadName;

	public ThreadSleepTime(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	static void printDateTime() {
		Date date = new Date();
		String string = String.format("Current Date/Time : %tc", date);
		System.out.println(string);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 0; i < 2; i++) {
				printDateTime();
				Thread.sleep(10000);
			}
		}

		catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
	}
}
