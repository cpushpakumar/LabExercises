package com.pojo;

import java.util.Date;

public class ThreadSleepTimeWithoutTryCatch extends Thread {
	private String threadName;

	public ThreadSleepTimeWithoutTryCatch(String threadName) {
		super();
		this.threadName = threadName;
	}

	public void ThreadSleepTime(String name) {
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
		printDateTime();

	}

}
