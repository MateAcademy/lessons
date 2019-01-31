package lesson04.genericClazz;

/**
 * @author spasko
 */
public class AntogonistsAnimal<T extends Animal, V extends Animal> {
	private T t;

	private V v;

	public AntogonistsAnimal(T t, V v) {
		this.t = t;
		this.v = v;
	}

	public void antogonists() {
		System.out.println(t.name() + "  very often antogonist to " + v.name());
	}

}
