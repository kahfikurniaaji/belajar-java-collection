package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(10);
        // List<String> strings = new LinkedList<>();

        strings.add("Kahfi");
        strings.add("Kurnia");

        strings.set(0, "Fauzan");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (String value : strings) {
            System.out.println(value);
        }

    }
}
