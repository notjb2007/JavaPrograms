import java.util.*;

public class Experiment20_RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        // Read integers; stop if non-integer entered
        while (sc.hasNext()) {
            try {
                nums.add(sc.nextInt());
            } catch (InputMismatchException e) {
                break;
            }
        }

        // Print original list
        for (int i = 0; i < nums.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(nums.get(i));
        }
        System.out.println();

        // Remove duplicates, keep first occurrence
        LinkedHashSet<Integer> set = new LinkedHashSet<>(nums);
        ArrayList<Integer> unique = new ArrayList<>(set);

        for (int i = 0; i < unique.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(unique.get(i));
        }
    }
}
