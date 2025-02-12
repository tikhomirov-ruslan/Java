package problem1a;

class Sphere extends Shape3D {
	
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	double volume() {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}
	
	double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}

