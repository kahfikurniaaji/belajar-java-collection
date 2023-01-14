package programmer.zaman.now.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Kahfi");
        list.add("Kurnia");
        list.add("Aji");

        for (var value : list) {
            System.out.println(value);
        }

    }
}
