import java.util.*;

public class MaxMinFinder22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        if (numbers.size() > 0) {
            int max = numbers.get(0), min = numbers.get(0);
            for (int num : numbers) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}
