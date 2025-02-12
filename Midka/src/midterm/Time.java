package midterm;

class Time extends Contact {
	
	private int time;
	
	public Time(String name, int phoneNumber, int time) {
		super(name, phoneNumber);
		this.time = time;
	}
	
	public String toString() {
		return "Time: " + time;
	}
}
