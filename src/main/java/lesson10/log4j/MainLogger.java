package lesson10.log4j;

/**
 * @author spasko
 */
public class MainLogger {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.div(5, 2);

		calculator.div(3, 0);
	}

}
