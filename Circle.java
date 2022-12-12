package edu.monmouth.shape;

public class Circle  implements Shape{
	private int radius;
	
	public Circle(int radius){
		this.setRadius(radius);	
	}
	
	public void setRadius(int radius) {
		if(radius > 0) {
		this.radius= radius;
		}
		else {
			this.radius = 0;
		}
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		String circleString = "The area of this circle is " + this.area();
		return circleString;
	}
	
	public double area() {
		double area =3.14 * (radius*radius); 
		return area;
	}

}
