package com.skillstorm.javaclass.homeworkentries.day3;


public class CircleMain {
	public static void main(String[] args) {
		Circle a = new Circle(3);
		System.out.println(a);
		
		Circle b = new Circle(2);
		System.out.println(b);
		
		System.out.println("Are they equal? ");
		System.out.println(a.isEqual(b));
		
	}	
	
}



