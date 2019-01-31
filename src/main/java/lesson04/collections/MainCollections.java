package lesson04.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author spasko
 */
public class MainCollections {

	public static void main(String[] args) {
		Set<Animal> animals = new HashSet<>();

		animals.add(new Animal("Cat", 2));
		System.out.println("1: " + animals);

		Animal animal2 = new Animal("Cat", 2);
		animals.add(animal2);
		System.out.println("2: " + animals);

		Animal animal1 = new Animal("Dog", 3);
		animals.clear();
		animals.add(animal1);
		animals.add(animal2);
		System.out.println("3: " + animals);

		animal1.setName("Cat");
		animal1.setOld(2);
		System.out.println("4: " + animals);

		animal1 = new Animal("Dog", 3);
		Map<Animal, String> mapAnimals = new HashMap<>();
		mapAnimals.put(animal1, "Bobic");
		mapAnimals.put(animal2, "Murka");
		System.out.println("5: " + mapAnimals);

		animal1.setName("Cat");
		animal1.setOld(2);
		System.out.println("6: " + mapAnimals);
		System.out.println("7: " + mapAnimals.get(new Animal("Cat", 2)));
		System.out.println("8: " + mapAnimals.get(new Animal("Dog", 3)));

		animal1 = new Animal("Dog", 3);
		animal2 = new Animal("Cat", 2);
		Animal animal3 = new Animal("Dog", 3);
		List<Animal> listAnimals = new ArrayList<>();
		listAnimals.add(animal1);
		listAnimals.add(animal2);
		listAnimals.add(animal3);
		System.out.println("9: " + listAnimals);

		for (Animal value : listAnimals) {
			if (value.equals(animal3)) {
				listAnimals.remove(value);
			}
		}

		listAnimals.removeIf(an -> an.equals(animal3));
		System.out.println("10: " + listAnimals);

	}
}
