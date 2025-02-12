package problem1b;

class Book extends LibraryItem {
	
	private String genre;
	
	public Book(String title, String author, int publicationYear, String genre) {
		
		super(title, author, publicationYear);
		this.genre = genre;
		
	}
	
	String specificProperties() {
		
		return "Genre: " + genre;
		
	}

}
