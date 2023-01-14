package programmer.zaman.now.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {

    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Kahfi", "Kahfi");
        map.put("Fauzan", "Fauzan");
        map.put("Widi", "Widi");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

    }

}
