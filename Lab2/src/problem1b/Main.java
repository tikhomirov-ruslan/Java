package problem1b;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book("War and Peace", "L. Tolstoy", 1867, "Belletre");
		
		System.out.println("Title: " + book.getTitle());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Publication Year: " + book.getPublicationYear());
		
		System.out.println(book.specificProperties());
		
	}
}
