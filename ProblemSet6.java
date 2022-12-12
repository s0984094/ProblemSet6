package edu.monmouth.problemSet6;
import edu.monmouth.shape.*;
public class ProblemSet6 {
	

	public static void main(String[] args) { 
		// validate invalid values are set to zero
		
		try {
			Rectangle invalidRectangle = new Rectangle(-9, -8);

		System.out.println("invalidRectangle length: " + invalidRectangle.getLength() + 
				" width: " + invalidRectangle.getWidth());
		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		
		try { Circle invalidCircle = new Circle(-7);
		System.out.println("invalidCircle radius: " + invalidCircle.getRadius());
		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		// create valid Rectangles and Circles
		try {
		Rectangle smallRectangle = new Rectangle(3, 4);
		System.out.println(smallRectangle);
		printArea(smallRectangle);

		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		try {
		Rectangle largeRectangle = new Rectangle(300, 400);
		System.out.println(largeRectangle);
		printArea(largeRectangle);
		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		try {
		Circle smallCircle = new Circle(5);
		System.out.println(smallCircle);
		printArea(smallCircle);
		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		try {
		Circle largeCircle = new Circle(50);
		System.out.println(largeCircle);
		printArea(largeCircle);
		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		
		
		// declare a reference to a Shape that refers to a concrete class
		try {
		Shape rectangle = new Rectangle(8, 12);
		System.out.println(rectangle);
		printArea(rectangle);
		}
		catch(ShapeException e) {
			System.out.println(e);
		}
		try {
		Shape circle = new Circle(10);
		System.out.println(circle);
		printArea(circle);
		}
		catch(ShapeException e) {
			System.out.println(e);
		}

	}
	
	static void printArea(Shape shape) {
		System.out.println(shape.area());
	}
}

