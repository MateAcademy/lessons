package lesson08.multitheading.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author spasko
 */
public class MainLock {

	public static void main(String[] args) {

		CommonResource commonResource = new CommonResource(0);
		ReentrantLock locker = new ReentrantLock();
		for (int i = 0; i < 6; i++) {

			Thread t = new Thread(new CountRunnable(commonResource, locker));
			t.setName("Thread " + i);
			t.start();
		}
	}
}
