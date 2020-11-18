package com.main;

import com.pojo.Number;

public class MultiplesOf258UsingRunnableMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		Number ti = new Number("Welcome");
		
		ti.multiplesOf2();
		ti.multiplesOf5();
		ti.multiplesOf8();
		Thread t1 = new Thread(ti);
		t1.start();
		
		
		

	}

}
