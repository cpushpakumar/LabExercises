package com.main;

import com.pojo.ThreadImplementingThread;

public class ThreadImplementingThreadMain {

	public static void main(String[] args) {
		ThreadImplementingThread ti = new ThreadImplementingThread("Hello");
		ti.start();
		

	}

}
