package lesson04.genericClazz;

/**
 * @author spasko
 */
public class MainGenericClazz {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal mouse = new Mouse();
		AntogonistsAnimal<Animal, Animal> antogonists1 = new AntogonistsAnimal<Animal, Animal>(cat, dog);
		antogonists1.antogonists();
		System.out.println("111----------");
		
		// AntogonistsAnimal<Cat, Mouse> antogonists2 = new AntogonistsAnimal<Cat,
		// Mouse>(cat, mouse);
		AntogonistsAnimal<Cat, Mouse> antogonists2 = new AntogonistsAnimal<Cat, Mouse>((Cat) cat, (Mouse) mouse);
		antogonists2.antogonists();
		System.out.println("222----------");

		// antogonists1=antogonists2;

		Cat cat2 = new Cat();
		Mouse mouse2 = new Mouse();
		AntogonistsAnimal<Cat, Mouse> antogonists3 = new AntogonistsAnimal<Cat, Mouse>(cat2, mouse2);
		antogonists2.antogonists();
		System.out.println("333----------");
		antogonists2 = antogonists3;

	}

}
