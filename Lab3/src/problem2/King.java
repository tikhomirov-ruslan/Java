package problem2;

class King implements Moveable, Stopable{
	public void move() {
		System.out.println("Move from B3");
	}
	
	public void stop() {
		System.out.println("Stop on B4");
	}
	
	public void eat() {
		System.out.println("Eat figure on B4");
	}
}
