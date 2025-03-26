package Shapes;

public class Square extends Shape {
	private double side;
	
	public Square(String n, double s) {
		super(n);
		side = s;
	}
	
	public double calculateArea() {
		double area = (double) side*side;
		return area;
	}
}
