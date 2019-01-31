package lesson07.multitheading.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author spasko
 */
public class Consumer implements Runnable {

	private BlockingQueue<Message> queue;

	public Consumer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		try {
			Message msg;
			// consuming messages until exit message is received
			while ((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(10);
				System.out.println("Consumed " + msg.getMsg());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
