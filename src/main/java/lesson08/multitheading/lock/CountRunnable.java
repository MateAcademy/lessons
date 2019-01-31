package lesson08.multitheading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author spasko
 */
public class CountRunnable implements Runnable {

	private CommonResource res;
	private Lock locker;

	CountRunnable(CommonResource res, ReentrantLock lock) {
		this.res = res;
		locker = lock;
	}

	public void run() {
		// set lock
		locker.lock();
		try {
			for (int i = 0; i < 5; i++) {
				res.incrementValue();
				System.out.printf("%s %d \n", Thread.currentThread().getName(), res.getValue());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		} finally {
			// set unlock to resource
			locker.unlock();
		}
	}
}