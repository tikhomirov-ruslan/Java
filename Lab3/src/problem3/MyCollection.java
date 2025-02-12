package problem3;

import java.util.Iterator;

public interface MyCollection<E> extends Iterable<E> {
	
	boolean add (E item); // добавляет в коллекцию объект item. При удачном добавлении возвращает true, при неудачном - false

	boolean addAll (MyCollection<? extends E> col); // добавляет в коллекцию все элементы из коллекции col. При удачном добавлении возвращает true, при неудачном - false

	void clear (); // удаляет все элементы из коллекции

	boolean contains (Object item); // возвращает true, если объект item содержится в коллекции, иначе возвращает false

	boolean isEmpty (); // возвращает true, если коллекция пуста, иначе возвращает false

	Iterator<E> iterator (); // возвращает объект Iterator для обхода элементов коллекции

	boolean remove (Object item); // возвращает true, если объект item удачно удален из коллекции, иначе возвращается false

	boolean removeAll (MyCollection<?> col); // удаляет все объекты коллекции col из текущей коллекции. Если текущая коллекция изменилась, возвращает true, иначе возвращается false

	boolean retainAll (MyCollection<?> col); // удаляет все объекты из текущей коллекции, кроме тех, которые содержатся в коллекции col. Если текущая коллекция после удаления изменилась, возвращает true, иначе возвращается false

	int size (); // возвращает число элементов в коллекции

	Object[] toArray (); // возвращает массив, содержащий все элементы коллекции
	
}
