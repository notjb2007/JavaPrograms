import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("ArrayList: " + list);

        list.remove("Banana");
        System.out.println("After removal: " + list);

        System.out.println("Contains Mango? " + list.contains("Mango"));

        for (String fruit : list)
            System.out.println(fruit);
    }
}
