package problem1a;

class Cube extends Shape3D {
	
	private double side;
	
	public Cube(double side) {	
		this.side = side;
	}
	
	double volume() {
		return Math.pow(side, 3);
	}
	
	double surfaceArea() {		
		return 6 * Math.pow(side, 2);
	}
}
