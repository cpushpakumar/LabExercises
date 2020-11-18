package com.pojo;

public class Number implements Runnable {
	Thread thread;
	private String name;

	public void start() {
		thread.start();
	}

	public String toString() {
		return "hello";
	}

	public void multiplesOf2() throws InterruptedException {
		System.out.println("Multiples of 2 are :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(2 * i);
			Thread.sleep(100);
		}
	}

	public void multiplesOf5() throws InterruptedException {
		System.out.println("Multiples of 5 are :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
			Thread.sleep(100);
		}
	}

	public void multiplesOf8() throws InterruptedException {
		System.out.println("Multiples of 8 are :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(8 * i);
			Thread.sleep(100);
		}
	}

	public Number(String name) {
		super();
		this.name = name;

	}

	@Override
	public void run() {
		System.out.println("Running " + name);
		System.out.println("Finished");

	}

}
