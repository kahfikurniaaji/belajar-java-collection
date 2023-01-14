package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Kahfi");

        Set<String> mutable = new HashSet<>();
        mutable.add("Kahfi");
        mutable.add("Kurnia");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Kahfi", "Kurnia");

        // set.add("Kahfi"); // ERROR
        // set.remove("Kahfi"); // ERROR

    }

}
