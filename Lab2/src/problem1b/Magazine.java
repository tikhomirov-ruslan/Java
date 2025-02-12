package problem1b;

class Magazine extends LibraryItem {
	
	private String model;
	
	public Magazine(String title, String author, int publicationYear, String model) {
		
		super(title, author, publicationYear);
		this.model = model;
		
	}
	
	String specificProperties() {
		
		return "Model: " + model;
	}
}
