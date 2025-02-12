package problem1b;

abstract class LibraryItem {
	
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem(String title, String author, int publicationYear) {
		
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		
	}
	
	abstract String specificProperties();

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}	
}
