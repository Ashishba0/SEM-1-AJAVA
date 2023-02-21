package Generic2;

import java.io.*;
import java.util.*;

interface Shape {
	abstract void Area();

	Scanner scanner = new Scanner(System.in);
}

class Circle implements Shape {
	public void Area() {
		System.out.println("Enter radius of circle:");
		float radius = scanner.nextFloat();
		float area = (float) (Math.PI * radius * radius);
		System.out.println("Area of Circle is " + area);
	}
}

class Square implements Shape {
	public void Area() {
		System.out.println("Enter the length of the side of a square:");
		float side = scanner.nextFloat();
		System.out.println("Area of Square is " + (side * side));
	}
}

public class BoundedShape<T extends Shape> {
	T obj;

	BoundedShape(T obj) {
		this.obj = obj;
	}

	void getObj() {
		this.obj.Area();
	}

	public static void main(String[] args) {
		BoundedShape<Circle> c = new BoundedShape<Circle>(new Circle());
		c.getObj();
		BoundedShape<Square> s = new BoundedShape<Square>(new Square());
		s.getObj();
	}
}
