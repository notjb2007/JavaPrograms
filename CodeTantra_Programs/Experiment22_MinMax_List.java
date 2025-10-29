import java.util.*;

public class Experiment22_MinMax_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (sc.hasNext()) {
            try {
                nums.add(sc.nextInt());
            } catch (InputMismatchException e) {
                break;
            }
        }

        if (nums.size() > 0) {
            int max = Collections.max(nums);
            int min = Collections.min(nums);
            System.out.println(max);
            System.out.println(min);
        }
    }
}
