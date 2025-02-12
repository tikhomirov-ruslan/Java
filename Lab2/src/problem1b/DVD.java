package problem1b;

class DVD extends LibraryItem {
	
	private String price; 
	
	public DVD(String title, String author, int publicationYear, String price) {
		
		super(title, author, publicationYear);
		this.price = price;
		
	}
	
	String specificProperties() {
		
		return "Price: " + price;
		
	}
}
