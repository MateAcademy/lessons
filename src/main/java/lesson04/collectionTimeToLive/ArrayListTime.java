package lesson04.collectionTimeToLive;
/**
 * @author spasko
 */

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTime<T> extends ArrayList<DummyForTime<T>> {
	private static final long DEFAULT_TIME_TO_LIVE = 100000l;
	private static final long serialVersionUID = 1L;
	private Long timeToLive;

	public ArrayListTime(Long timeToLive) {
		this.timeToLive = timeToLive;
	}

	public ArrayListTime() {
	}

	public ArrayListTime(Collection<? extends DummyForTime<T>> c) {
		super(c);
		timeToLive = DEFAULT_TIME_TO_LIVE;
	}

	public Long getTimeToLive() {
		return timeToLive;
	}

	@Override
	public int size() {
		super.removeIf(dummyForTime -> (System.currentTimeMillis() - dummyForTime.getTimeCreation()) >= timeToLive);
		return super.size();
	}
}
