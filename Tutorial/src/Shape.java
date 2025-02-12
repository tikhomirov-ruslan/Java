

Enum Color (RED, BLACK);

abstract class Shape {
	Color color;
	int pos;
	
	abstract void draw();
	
}


public class Circle extends Shape {
	public Circle(Color color, int pos) {
		super(color, pos);
		
	}
}