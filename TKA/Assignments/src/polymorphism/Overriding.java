package polymorphism;

class Shape {
	// Method to calculate area
	public double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	// Overriding the calculateArea method for Circle
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Overriding the calculateArea method for Rectangle
	@Override
	public double calculateArea() {
		return length * width;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		Shape rectangle = new Rectangle(4.0, 6.0);

		System.out.println("Area of Circle: " + circle.calculateArea());
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	}

}
