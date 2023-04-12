package com.skillstorm.javaclass.homeworkentries.day3;

public class Circle {
	static double pi = 3.14159;

	double enteredRadius;
	double diameter;
	double circumference;
	double area;

	public Circle() {
		this.enteredRadius = 0;
		this.diameter = 0;
		this.circumference = 0;
		this.area = 0;
	}

	public double calculateDiameter(double enteredRadius) {
		double d = enteredRadius * 2;
		return d;
	}

	public double calculateCircumference(double enteredRadius) {
		double c = enteredRadius * 2 * pi;
		return c;
	}

	public double calculateArea(double enteredRadius) {
		double a = pi * (Math.pow(enteredRadius, 2));
		return a;
	}

	public Circle(double enteredRadius) {
		this.enteredRadius = enteredRadius;
		this.diameter = calculateDiameter(enteredRadius);
		this.circumference = calculateCircumference(enteredRadius);
		this.area = calculateArea(enteredRadius);
	}

	public String toString() {
		return "Radius: " + enteredRadius + " meters, " + "Diameter: " + diameter + " meters, " + "Circumference "
				+ circumference + " meters, " + "Area: " + area + " meters.";
	}

	public boolean isEqual(Circle other) {
		if (this.enteredRadius == other.enteredRadius)
			return true;
		else
			return false;
	}

}

// THIS IS WHAT WAS PUT IN MY MAIN CLASS:
//public class CircleMain {
//
//	public static void main(String[] args) {
//		Circle a = new Circle(0);
//		System.out.println(a);
//		
//		Circle b = new Circle(3);
//		System.out.println(b);
//		
//		System.out.println("Are they equal? ");
//		System.out.println(a.isEqual(b));
//		
//	}	
//	
//}


