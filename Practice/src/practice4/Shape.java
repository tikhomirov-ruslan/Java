package practice4;

enum Color {
	RED, 
	BLUE,
	BLACK
}

abstract class Shape {
	
	Color color;
	int position;
	
	public Shape(Color color, int position) {
		this.color = color;
		this.position = position;
	}
	
	public abstract void draw();

}
