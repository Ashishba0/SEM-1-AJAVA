package com.spring.spring3;

public class Vehicle {
	private String name, color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Car is " + name + " and colour is " + color;
	}
}
