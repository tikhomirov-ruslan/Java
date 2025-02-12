package problem3;

public class Temperature {
	
	private double value;
	private char scale;
	
	public Temperature() {
		this.value = 0.0;
		this.scale = 'C';
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public Temperature(double value) {
		this(value, 'C');
	}
	
	public Temperature(char scale) {
		this(0.0, scale);
	}
	
	public double getCelsius() {
		if (scale == 'C') {
			return value;
		}
		else {
			return 5 * (value - 32) / 9;
		}
	}
	
	public double getFahrenheit() {
		if (scale == 'F') {
			return value;
		}
		else {
			return (9 * (value / 5)) + 32;
		}
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
		if (scale == 'F' || scale == 'C') {
			this.scale = scale;
		}
		else {
			System.out.println("'C' for Celsius or 'F' for Fahrenheit");
		}
	}
	
	public void setValueAndScale(double value, char scale) {
		setValue(value);
		setScale(scale);
	}
	
	public char getScale() {
		return scale;
	}
	
	public static void main(String[] args) {
		Temperature temp1 = new Temperature(32, 'F'); // 32 градуса по Фаренгейту
        Temperature temp2 = new Temperature(); // 0 градусов по Цельсию
        Temperature temp3 = new Temperature('F'); // 0 градусов по Фаренгейту 
        
        System.out.println("Temperature 1 in Celsius: " + temp1.getCelsius());
        System.out.println("Temperature 2 in Fahrenheit: " + temp2.getFahrenheit());
        System.out.println("Temperature 3 scale: " + temp3.getScale());
        
        temp1.setValueAndScale(25, 'C');
        System.out.println("Updated Temperature 1 in Celsius: " + temp1.getCelsius());
	}
}
