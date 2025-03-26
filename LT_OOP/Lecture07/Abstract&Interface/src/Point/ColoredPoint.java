package Point;

abstract class ColoredPoint extends Point{
	int color;

	public ColoredPoint(int x, int y, int color) {
		super(x,y);
		this.color = color;
	}
	
}
