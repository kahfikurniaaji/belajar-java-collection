package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Kahfi", "Kahfi");
        map.put("Fauzan", "Fauzan");
        map.put("Widi", "Widi");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Kahfi"));
        System.out.println(map.higherKey("Kahfi"));
        System.out.println(map.floorKey("Nugraha"));
        System.out.println(map.ceilingKey("Nugraha"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (String key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Kahfi", "Kahfi"); // ERROR

    }
}
