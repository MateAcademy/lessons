package lesson04.genericClazz;

/**
 * @author spasko
 */
public class Cat implements Animal {
	@Override
	public String name() {
		return "Cat";
	}

	@Override
	public String say() {
		return "Murrr";
	}

	@Override
	public String toString() {
		return "Cat [name()=" + name() + ", say()=" + say() + "]";
	}

}
