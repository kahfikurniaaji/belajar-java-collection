package programmer.zaman.now.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Kahfi");
        stack.push("Kurnia");
        stack.push("Aji");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }

    }
}
