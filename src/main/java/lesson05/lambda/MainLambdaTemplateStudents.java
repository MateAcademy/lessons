package lesson05.lambda;

import static lesson05.lambda.FruitType.APPLE;
import static lesson05.lambda.FruitType.ORANGE;
import static lesson05.lambda.FruitType.PEAR;
import static lesson05.lambda.FruitType.STRAWBERRY;
import static lesson05.lambda.Vitamins.A;
import static lesson05.lambda.Vitamins.B;
import static lesson05.lambda.Vitamins.B1;
import static lesson05.lambda.Vitamins.B2;
import static lesson05.lambda.Vitamins.C;
import static lesson05.lambda.Vitamins.D;
import static lesson05.lambda.Vitamins.E;
import static lesson05.lambda.Vitamins.P;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author spasko
 */
public class MainLambdaTemplateStudents {
	public static void main(String[] args) {
		List<Fruit> fruits = fillFruitsList();
		fruits.forEach(System.out::println);

		
	}

	private static List<Fruit> fillFruitsList() {
		List<Fruit> fruits = new ArrayList<>();

		Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { B, C }));
		fruits.add(fruit);

		fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { A, C }));
		fruits.add(fruit);

		fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { A, B1, B2, C }));
		fruits.add(fruit);

		fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { E, B, A }));
		fruits.add(fruit);

		fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { A, C, D }));
		fruits.add(fruit);

		fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { A, B, B1, B2, P }));
		fruits.add(fruit);

		fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { B1, B2, P }));
		fruits.add(fruit);

		fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
		fruit.setVitamins(Arrays.asList(new Vitamins[] { B, C }));
		fruits.add(fruit);

		return fruits;
	}
}
