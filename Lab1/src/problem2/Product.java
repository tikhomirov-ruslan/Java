package problem2;

public class Product {
	
	public enum Category {
		FOOD,
		CLOTHING,
		ELECTRONICS
	}
	
	private final int id;
	private String name;
	private double price;
	private Category category;
	
	private static int nextId = 1;
	
	{
		id = nextId++;
	}
	
	public Product(String name, double price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public Product(String name, double price) {
		this(name, price, Category.FOOD);
	}
	
	public int getId() {
		return id;
	}
	
	public void displayInfo() {
		System.out.println("Product ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
	}
	
	public static void main(String[] args) {
		Product product1 = new Product("Chocolate", 850.0, Category.FOOD);
		Product product2 = new Product("Snickers", 10000.0, Category.CLOTHING);
		Product product3 = new Product("Laptop", 200000.0, Category.ELECTRONICS);
		
		product1.displayInfo();
	    product2.displayInfo();
	    product3.displayInfo();
	}
	
}
