package lesson08.multitheading.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author spasko
 */
public class CountRunnable implements Runnable {

	private CommonResource res;
	private Semaphore semaphore;
	private String name;

	public CountRunnable(CommonResource res, Semaphore sem, String name) {
		this.res = res;
		this.semaphore = sem;
		this.name = name;
	}

	public void run() {

		try {
			System.out.println(name + " waiting");
			semaphore.acquire();
			for (int i = 0; i < 5; i++) {
				res.incrementValue();
				System.out.println(this.name + ": " + res.getValue());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name + " end work");
		semaphore.release();
	}
}
