package lesson01;

/**
 * @author spasko
 */
public class MainGeometryRecursion {
	public static void main(String[] args) {
		// 5->10->20->40->80
		System.out.println(getElementGeometryProgression(5, 2, 4));

		System.out.println(getElementGeometryProgressionRecursion(5, 2, 4));
	}

	static int getElementGeometryProgression(int startElement, int coeff, int number) {
		return (int) (startElement * Math.pow(coeff, number - 1));
	}

	static int getElementGeometryProgressionRecursion
	(int startElement, int coeff, int number) {
		int nextElement = startElement * coeff;
		number--;
		if (number == 1) {
			return nextElement;
		} else {
			return getElementGeometryProgressionRecursion
					(nextElement, coeff, number);
		}
	}
}
