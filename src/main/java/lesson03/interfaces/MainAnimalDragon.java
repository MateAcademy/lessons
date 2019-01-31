package lesson03.interfaces;

/**
 * @author spasko
 */
public class MainAnimalDragon {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		AnimalDragon animalDragon = new AnimalDragon();
		// default from Animal interface
		System.out.println(animalDragon.eatPeople());

		// from AnimalDragon class
		System.out.println(animalDragon.createMeat());
		// System.out.println(((Dragon) animalDragon).createMeat());

		// static from Animal interface
		System.out.println(Animal.doSomething());

		// static from Dragon interface
		System.out.println(Dragon.doSomething());

		// value from AnimalDragon class
		System.out.println(animalDragon.firstInt);

		// value from Animal interface
		System.out.println(animalDragon.secondInt);

		// value from Animal interface
		// System.out.println(animalDragon.thirdInt);
	}
}
