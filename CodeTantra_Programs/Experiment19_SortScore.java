import java.util.*;

public class Experiment19_SortScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            if (n < 0)
                break;
            scores.add(n);
        }

        Collections.sort(scores);

        for (int i = 0; i < scores.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(scores.get(i));
        }
    }
}
