package abstraction;

//Abstract class representing a shape
abstract class Shape {
	// Abstract method to calculate the area
	abstract double calculateArea();

	// Abstract method to display information about the shape
	abstract void displayInfo();
}

//Concrete class Circle that extends Shape
class Circle extends Shape {
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implementation of abstract method from Shape
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}

	// Implementation of abstract method from Shape
	@Override
	void displayInfo() {
		System.out.println("Circle with radius: " + radius);
	}
}

//Concrete class Rectangle that extends Shape
class Rectangle extends Shape {
	private double length;
	private double width;

	// Constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Implementation of abstract method from Shape
	@Override
	double calculateArea() {
		return length * width;
	}

	// Implementation of abstract method from Shape
	@Override
	void displayInfo() {
		System.out.println("Rectangle with length: " + length + " and width: " + width);
	}
}

public class Main {
	public static void main(String[] args) {

		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 6);

		// Calling abstract methods
		circle.displayInfo();
		System.out.println("Area of circle: " + circle.calculateArea() + "\n");

		rectangle.displayInfo();
		System.out.println("Area of rectangle: " + rectangle.calculateArea());
	}
}
