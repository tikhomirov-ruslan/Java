package practice4;

class Triangle extends Shape{
	
	private int n;
	
	public Triangle(Color color, int position, int n) {
		
		super(color, position);
		this.n = n;
	}
	
	public void draw() {
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int j = n - 2 * i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.err.println("Triangle Position: " + position + ", Color: " + color + ", Side: " + n);
	}

}