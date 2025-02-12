
class IPhone extends Phone {

	private int year;

	public IPhone(String model, String brand, int year) {
		
		super(model, brand);
		this.year = year;
		
	}

	public String toString() {
		return super.toString() + " (" + year + ")";
		
	}
}
