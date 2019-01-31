package lesson07.multitheading.singleton;

/**
 * @author spasko
 */
public class S5TheadSafeSingletonEffective {
	private static S5TheadSafeSingletonEffective instance;

	public S5TheadSafeSingletonEffective() {
	}

	public static S5TheadSafeSingletonEffective getInstance() {
		if (instance == null) {
			synchronized (S5TheadSafeSingletonEffective.class) {
				if (instance == null) {
					instance = new S5TheadSafeSingletonEffective();
				}
			}
		}
		return instance;
	}
}
