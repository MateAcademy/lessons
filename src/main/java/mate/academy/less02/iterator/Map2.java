package mate.academy.less02.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);

        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
