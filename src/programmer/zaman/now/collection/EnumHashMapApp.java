package programmer.zaman.now.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Kahfi");
        map.put(Level.VIP, "Kurnia");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }
}
