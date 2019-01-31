package lesson04.genericMethod;

import java.util.Arrays;

import lesson04.genericClazz.Animal;
import lesson04.genericClazz.Cat;
import lesson04.genericClazz.Dog;
import lesson04.genericClazz.Mouse;
import lesson04.genericMethod.GenericMethodExample;

/**
 * @author spasko
 */
public class MainGenerics {
	public static void main(String[] args) {

		GenericMethodExample genericMethodExample = new GenericMethodExample();
		genericMethodExample.doSomething("This is String", "This is String too =) ");
		System.out.println("111----------");

		genericMethodExample.doSomethingWithCat("This is String", new Cat());
		System.out.println("222----------");

		genericMethodExample.showAnimalNames(Arrays.asList(new Animal[] { new Dog(), new Mouse() }));
		System.out.println("333----------");

		genericMethodExample
				.showCatParentsNames(Arrays.asList(new Object[] { new Dog(), new Mouse(), new MainGenerics() }));
		System.out.println("444----------");

		genericMethodExample.showCatParentsNames(Arrays.asList(new Animal[] { new Cat(), new Dog() }));

	}

}
