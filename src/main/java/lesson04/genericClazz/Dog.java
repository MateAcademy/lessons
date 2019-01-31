package lesson04.genericClazz;

/**
 * @author spasko
 */
public class Dog implements Animal {

	@Override
	public String name() {
		return "Dog";
	}

	@Override
	public String say() {
		return "Gav!";
	}

	public String bite() {
		return "Bite your ass";
	}

}
