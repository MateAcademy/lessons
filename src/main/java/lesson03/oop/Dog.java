package lesson03.oop;
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

}
