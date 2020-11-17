package com.pojo;

public class ThreadImplementingRunnableInterface implements Runnable {
	Thread thread;
	private String name;

	public void start() {
		thread.start();
	}

	public String toString() {
		return "hello";
	}

	public ThreadImplementingRunnableInterface(String name) {
		super();
		this.name = name;

	}

	@Override
	public void run() {
		System.out.println("Running " + name);
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				Thread.sleep(10000);
			}
		}

		catch (InterruptedException e) {
			System.out.println("Thread " + name + " interrupted.");
		}
		String s = toString();
		System.out.println(s);
		System.out.println("running child Thread in loop : ");

	}

}
