package com.spring.spring2;

public class Shape {
	private double radius;
	private Rectangle rectangle;

	public Shape(double radius) {
		this.radius = radius;
	}

	public Shape(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	void displayInfo() {
		System.out.println("Area of circle: " + (Math.PI * radius * radius));
		System.out.println("Dimensions of rectangle:" + rectangle);
	}
}
