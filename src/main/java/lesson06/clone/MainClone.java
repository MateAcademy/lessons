package lesson06.clone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author spasko
 */
@SuppressWarnings("unused")
public class MainClone {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Cat"));
		animals.add(new Animal("Dog"));
		System.out.println("animals:" + animals);

		//List<Animal> animalsClone = animals.stream().collect(Collectors.toList());
		//List<Animal> animalsClone=new ArrayList<>(animals);
		List<Animal> animalsClone=new ArrayList<>();
		animals.forEach(an->{
			try {
				animalsClone.add((Animal) an.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		});
		animalsClone.get(0).setName("Pig");
		System.out.println("animalsClone:" + animalsClone);
		System.out.println("animals:" + animals);

	}
}
