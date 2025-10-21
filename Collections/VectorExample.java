import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Red");
        v.add("Green");
        v.add("Blue");

        System.out.println("Vector: " + v);
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
    }
}
