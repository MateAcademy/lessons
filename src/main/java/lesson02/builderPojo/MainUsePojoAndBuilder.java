package lesson02.builderPojo;

/**
 * @author spasko
 */
public class MainUsePojoAndBuilder {
	public static void main(String[] args) {
		String name = "Mate";
		String surname = "Academy";
		int old = 3;

		PojoExample pojoExample = new PojoExample(name, surname, old);
		System.out.println(pojoExample);

		BuilderExample builderExample = BuilderExample.builder().withName(name).withSurname(surname).withOld(old)
				.build();
		System.out.println(builderExample);
	}
}
