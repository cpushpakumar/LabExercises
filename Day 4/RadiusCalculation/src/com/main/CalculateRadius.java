/*Create an abstract class named Shape with the following protected attributes / member variables.
String name
Include a 1-argument constructor.
Include getters and setters.
Include an abstract method named calculateArea() . This method returns a Float value.
Create a class named Circle . The class Circle is a derived class of Shape. Include the following private attributes / member variables.
Integer radius
Include a 2-argument constructor. The order of the arguments is name, radius.
Include getters and setters.
Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the circle. [Take the value of pi as 3.14]
Create a class named Square . The class Square is a derived class of Shape. Include the following private attributes / member variables.
Integer side
Include a 2-argument constructor. The order of the arguments is name, side.
Include getters and setters.
Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the square.
Create a class named Rectangle . The class Rectangle is a derived class of Shape. Include the following private attributes / member variables.
Integer length
Integer breadth
Include a 3-argument constructor. The order of the arguments is name, length, breadth
Include getters and setters.
Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the rectangle.
Create another class called Main. In the method, create instances of the above classes and test the above classes.
All Float values are displayed correct to 2 decimal places.
All text in bold corresponds to input and the rest corresponds to output.
Sample Input and Output 1:
Circle
Square
Rectangle
Enter the shape name
Circle
Enter the radius
25
Area of Circle is 1962.50
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

public class CalculateRadius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter shape name :");
		String word = scanner.nextLine();
		if (word.equalsIgnoreCase("circle")) {
			int radius;
			System.out.println("Enter the radius :");
			radius = scanner.nextInt();
			Circle circle = new Circle("Circle", radius);
			int area = circle.calculateArea();
			System.out.println("The area of circle is :" + area);
			circle = null;

		} else if (word.equalsIgnoreCase("square")) {
			int side;
			System.out.println("Enter the side :");
			side = scanner.nextInt();
			Square square = new Square("Square", side);
			int area = square.calculateArea();
			System.out.println("The area of square is :" + area);
			square = null;

		} else if (word.equalsIgnoreCase("Rectangle")) {
			int length;
			int breadth;
			System.out.println("Enter the length :");
			length = scanner.nextInt();
			System.out.println("Enter the breadth :");
			breadth = scanner.nextInt();
			Rectangle rectangle = new Rectangle("Rectangle", length, breadth);
			int area = rectangle.calculateArea();
			System.out.println("The area of Rectangle is :" + area);
			rectangle = null;

		}

		scanner.close();
	}

}
