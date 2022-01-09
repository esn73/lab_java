package edu.java.inheritance09;

public class Circle extends Shape {
	// field
	private double radius;
	

	// constructor
	public Circle(double radius) {
		super("동그라미");
		this.radius = radius;
	}

	@Override
	public double area() {
			return Math.PI * radius * radius; // PI 는 static으로 선언되어있는 변수 변경불가
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

} //end class

