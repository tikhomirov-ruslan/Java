package problem1a;

class Cylinder extends Shape3D{
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	double volume() {
		return Math.PI * radius * radius * height;
	}
	
	double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
}
