package mate.academy.hw09.task2;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMaxStream {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        final Object[] max = new Object[1];
        final Object[] min = new Object[1];
        max[0] = null;
        min[0] = null;
        stream.forEach(e -> {
            if (max[0] == null) max[0] = e;
            if (min[0] == null) min[0] = e;
            int t = order.compare((T)max[0], e);
            if (t < 0) max[0] = e;
            t = order.compare((T)min[0], e);
            if (t > 0) min[0] = e;
        });
        minMaxConsumer.accept(min[0] != null?(T)min[0]:null, max[0] != null?(T)max[0]:null);
    }
}
