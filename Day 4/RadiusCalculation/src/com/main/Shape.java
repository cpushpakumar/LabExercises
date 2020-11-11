package com.main;

public abstract class Shape {
	public abstract int calculateArea();

	protected static String name;
	
	public Shape(String name) {
		super();
		Shape.name=name;
	}
/*
	public static String getName() {
		return name;
	}
*/
	public static void setName(String name) {
		Shape.name = name;
	}
	

}
