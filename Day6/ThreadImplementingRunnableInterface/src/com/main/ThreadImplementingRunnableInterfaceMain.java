package com.main;

import com.pojo.ThreadImplementingRunnableInterface;

public class ThreadImplementingRunnableInterfaceMain {

	public static void main(String[] args) {
		ThreadImplementingRunnableInterface ti = new ThreadImplementingRunnableInterface("Hello");
		Thread t1=new Thread(ti);
		t1.start();
		System.out.println("Hello");

	}

}
