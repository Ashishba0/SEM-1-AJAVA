package Lambda;

import java.util.Scanner;

public class lambdaExpression {
	public static void main(String args[]) {
		interface Maths {
			public float Area();
		}
		Scanner userInput = new Scanner(System.in);
		System.out.println("-----------Calculating the Area of Triangle using Lamba Expression ! --------------");
		System.out.println("Enter the Height of the Triangle: ");
		int height = userInput.nextInt();
		System.out.println("Enter the Base of the Triangle: ");
		int base = userInput.nextInt();
		Maths Areas = () -> {
			float areaOfTriangle = (height * base) / 2;
			return areaOfTriangle;
		};
		System.out.println(
				"Area of the Triangle whose height is " + height + " & base is " + base + " : " + Areas.Area());
	}
}

