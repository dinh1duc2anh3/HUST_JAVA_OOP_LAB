package Interface;

import java.awt.Graphics;

public abstract class Shape {
	protected String name;
	protected int x,y;
	
	public Shape(String n, int x, int y) {
		name = n;
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}
	public abstract double calculateArea() ;
	
}	

