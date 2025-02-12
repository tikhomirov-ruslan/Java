import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		HashSet<Phone> phoneHashSet = new HashSet<>();

		Phone phone15 = new Phone("15", "Apple");
		Phone phone2 = new Phone("Vivo", "Android");
		Phone phone3 = new IPhone("Samsung", "Android", 2020);
		Phone phone4 = new IPhone("15", "Apple", 2023);

		phoneHashSet.add(phone15);
		phoneHashSet.add(phone2);
		phoneHashSet.add(phone3);
		phoneHashSet.add(phone4);

		System.out.println("HashSet size: " + phoneHashSet.size());

		for (Phone phone : phoneHashSet) {

			System.out.println(phone);

		}
	
	}
}
