import java.util.*;

public class DuplicateRemover20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        // Print original list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) System.out.print(" ");
        }
        System.out.println();
        // Remove duplicates
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (!uniqueNumbers.contains(num)) uniqueNumbers.add(num);
        }
        for (int i = 0; i < uniqueNumbers.size(); i++) {
            System.out.print(uniqueNumbers.get(i));
            if (i != uniqueNumbers.size() - 1) System.out.print(" ");
        }
    }
}
