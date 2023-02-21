package com.spring.spring2;

public class Rectangle {
	private String length, breadth;

	public Rectangle() {
	}

	public Rectangle(String length, String breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public String getLenghth() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getBreadth() {
		return breadth;
	}

	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	public String toString() {
		return "length= " + length + " breadth= " + breadth;
	}
}
