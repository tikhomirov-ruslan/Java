
public class Enum {
	public static void main(String[] args) {
		
		Book b = new Book("Calculus", Type.Calculus);
		System.out.printf("Book - " + b.name, b.bookType);
		
	}
}
		
class Book {
			
	String name;
	Type bookType;
			
	Book(String name, Type type) {
		bookType = type;
		this.name = name;
		// this.author = author;
	}
}
		
enum Type{
	Calculus,
	DiscreteMath,
	OOP,
	ICT,
	Kazakh
}
