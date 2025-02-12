package practice4;
import java.util.Vector;

public class ShapeTest {
	public static void main(String[] args) {
		
		Vector<Shape> shapes = new Vector<>();

		Circle circle = new Circle(Color.RED, 3, 3);
		Rectangle rectangle = new Rectangle(Color.BLUE, 3, 8, 4);
		Triangle triangle = new Triangle(Color.BLACK, 3, 5);
		
		shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for (Shape shape : shapes) {
            shape.draw();
        }
        
	}

}
