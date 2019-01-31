package lesson08.multitheading.semaphore;

/**
 * @author spasko
 */
import java.util.concurrent.Semaphore;

public class MainSemaphore {
	public static void main(String[] args) {
		// one permission
		Semaphore sem = new Semaphore(2);
		CommonResource res = new CommonResource(0);
		new Thread(new CountRunnable(res, sem, "CountThread 1")).start();
		new Thread(new CountRunnable(res, sem, "CountThread 2")).start();
		new Thread(new CountRunnable(res, sem, "CountThread 3")).start();
	}
}
