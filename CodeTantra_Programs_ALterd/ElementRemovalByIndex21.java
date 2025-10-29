import java.util.*;

public class ElementRemovalByIndex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.nextLine(); // Move to the second input line
        int index = scanner.nextInt();
        if (index < 0 || index >= numbers.size()) {
            System.out.println("Index out of range");
        } else {
            numbers.remove(index);
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i));
                if (i != numbers.size() - 1) System.out.print(" ");
            }
        }
    }
}
