package lesson08.multitheading.executor;

/**
 * @author spasko
 */
public class CountRunnable implements Runnable {

	private CommonResource res;
	private String name;

	CountRunnable(CommonResource res, String name) {
		this.res = res;
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				res.incrementValue();
				System.out.printf("%s %d \n", name, res.getValue());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}