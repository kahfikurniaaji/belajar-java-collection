package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Kahfi");
        collection.add("Kurnia");
        collection.add("Aji");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (String value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Kahfi");
        collection.remove("Fauzan");
        collection.removeAll(List.of("Zaman", "Now"));

        for (String value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Kurnia")
        );

        System.out.println(
                collection.containsAll(List.of("Aji", "Programmer"))
        );

    }
}
