import java.util.HashSet;

class Phone {

	private String model;
	private String brand;

	public Phone(String model, String brand) {
		
		this.model = model;
		this.brand = brand;
	
	}

	public boolean equals(Object o) {

		if (this == o) return true;
		
		if (o == null || getClass() != o.getClass()) return false;

		Phone phone = (Phone) o;

		if (!brand.equals(phone.brand)) return false;
		
		return model.equals(phone.model);
	}

	public int hashCode() {

		int result = brand.hashCode();
		result = 31 * result + model.hashCode();
		return result;

	}

	public String toString() {

		return "Phone: " + brand + " " + model + " " + hashCode(); 

	}
}
