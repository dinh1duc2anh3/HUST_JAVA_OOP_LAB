package Shapes;

public class Triangle extends Shape {
	private double base, height;
	
	Triangle (String n, double b, double h){
		super(n);
		base = b;
		height = h;
	}
	
	public double calculateArea() {
		double area = (double) (base*height *0.5f);
		return area;
	}
	
}
