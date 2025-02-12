package problem1;

abstract class Shape {
	
	abstract void draw(); //абстрактный метод
	
	void resize() { // метод с реализацией
		System.out.println("resize");
	}
	
}
