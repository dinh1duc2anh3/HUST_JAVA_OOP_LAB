package Point;

public abstract class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int dx, int dy) {
		x += dx;
		y +=dy;
		plot();
	}
	
	public abstract void plot(); //phương thức trừu tượng ko cso phần code thực hiện  
	
}
