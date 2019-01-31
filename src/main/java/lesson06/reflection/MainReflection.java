package lesson06.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author spasko
 */
public class MainReflection {

	private static final String LESSON06_REFLECTION_ANIMAL = "lesson06.reflection.Animal";

	public static void main(String[] args) {
		try {
			Animal animal = new Animal("Kitten", 1);
			System.out.println(animal);

			System.out.println("\nGet all fields");
			Field[] allFields = Class.forName(LESSON06_REFLECTION_ANIMAL).getDeclaredFields();
			System.out.println(Arrays.toString(allFields));

			System.out.println("\nInvoking private field");
			Field privateField = Class.forName(LESSON06_REFLECTION_ANIMAL).getDeclaredField("name");
			privateField.setAccessible(true);
			privateField.set(animal, "New name for Cat");
			System.out.println(animal);

			System.out.println("\nGet all methods");
			Method[] allMethods = Class.forName(LESSON06_REFLECTION_ANIMAL).getDeclaredMethods();
			System.out.println(Arrays.toString(allMethods));

			System.out.println("\nInvoking private method");
			Method method = Class.forName(LESSON06_REFLECTION_ANIMAL).getDeclaredMethod("someInternalLogic");
			method.setAccessible(true);
			method.invoke(animal);
			System.out.println(animal);

			System.out.println("\nGet all constructors");
			Constructor<?>[] allConstructors = Class.forName(LESSON06_REFLECTION_ANIMAL).getDeclaredConstructors();
			System.out.println(Arrays.toString(allConstructors));

			System.out.println("\nInvoking private constructor");
			Constructor<?> constructor = Class.forName(LESSON06_REFLECTION_ANIMAL).getDeclaredConstructor();
			constructor.setAccessible(true);
			animal = (Animal) constructor.newInstance();
			System.out.println(animal);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
