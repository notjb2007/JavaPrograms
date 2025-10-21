import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
