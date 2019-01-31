package lesson01;

/**
 * @author spasko
 */
public class MainFibonachiRecursion {
	public static void main(String[] args) {
		// 0->1->1->2->3->5->8->13->
		long timePoint = System.nanoTime();
		int elementNumber = 40;
		System.out.println("By math method: " + getElementFibonachi(elementNumber));
		System.out.println("By math method, time: " + (System.nanoTime() - timePoint));

		timePoint = System.nanoTime();
		System.out.println("By recursion method: " + getElementFibonachiRecursion(elementNumber));
		System.out.println("By recursion method, time : " + (System.nanoTime() - timePoint));
	}

	static int getElementFibonachi(int number) {
		int valuePrev = 0;
		if (number == 0)
			return valuePrev;
		int valueNext = 1;
		for (int i = 2; i < number; i++) {
			int temp = valueNext;
			valueNext += valuePrev;
			valuePrev = temp;
		}
		return valueNext;
	}

	static int getElementFibonachiRecursion(int number) {
		if (number <= 2)
			return number - 1;
		return getElementFibonachiRecursion(number - 2) + getElementFibonachiRecursion(number - 1);
	}

}
