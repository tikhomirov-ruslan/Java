package problem1a;

public class Main {

	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(2, 6);
	
		System.out.println("Cylinder Volume: " + cylinder.volume());
		System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
		System.out.println();
		
		Sphere sphere = new Sphere(2);
		
		System.out.println("Sphere Volume: " + sphere.volume());
		System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
		System.out.println();
		
		Cube cube = new Cube(4);
		
		System.out.println("Cube Volume: " + cube.volume());
		System.out.println("Cube Surface Area: " + cube.surfaceArea());
		
	}
}
