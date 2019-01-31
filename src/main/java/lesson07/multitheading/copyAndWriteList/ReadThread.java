package lesson07.multitheading.copyAndWriteList;

import java.util.Iterator;
import java.util.List;

/**
 * @author spasko
 */
public class ReadThread extends Thread {
	private List<Integer> list;

	public ReadThread(String name, List<Integer> list) {
		this.list = list;
		super.setName(name);
	}

	public void run() {

		while (true) {

			String output = "\n" + super.getName() + ":";

			Iterator<Integer> iterator = list.iterator();

			while (iterator.hasNext()) {
				Integer next = iterator.next();
				output += " " + next;

				// fake processing time
				try {

					Thread.sleep(10);

				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}

			System.out.println(output);
		}
	}
}
