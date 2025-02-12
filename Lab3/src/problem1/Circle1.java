package problem1;

class Circle1 implements Shape1, Shape2 { // множество интерфейсов в одном класссе
	
	public void draw() {
		System.out.println("O");
	}
	
	public void resize() {
		System.out.println("resize");
	}
	
 }
