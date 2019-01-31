package lesson03.oop;

/**
 * @author spasko
 */
public class Tiger extends Cat {
	private String personalName;

	public Tiger() {
		personalName = "Barsik";
	}

	@Override
	public String name() {
		return "Tiger(extra-variant of " + super.name() + ")";
	}

	public String getPersonalName() {
		return personalName;
	}

}
