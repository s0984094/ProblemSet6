package edu.monmouth.shape;

public class Rectangle extends ShapeException implements Shape {
	private int length;
	private int width;

	public Rectangle (int length, int width) throws ShapeException {
		this.setLength(length);
		this.setWidth(width);
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) throws ShapeException{
		if(width >0) {
		this.width = width;
		}
		else {
			throw new ShapeException("Width of " + width + " is invalid");
		}
	}
	
	public void setLength(int length) throws ShapeException {
		if (length > 0) {
			this.length = length;
		}
		else {
			throw new ShapeException("length of " +length + "is invalid");
		}
		
	}
	@Override
	public String toString() {
		String shapeString = "The area of this Rectangle is: " +this.area();
		return shapeString;
		
	}
	
	public double area() {
		double area = length*width;
		return area;
	}
}

