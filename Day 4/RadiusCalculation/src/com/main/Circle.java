package com.main;

public class Circle extends Shape {
	public int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int calculateArea() {
		return (int) (3.14 * radius * radius);
	}

}
