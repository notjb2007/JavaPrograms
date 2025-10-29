import java.util.*;

public class ExamScoreManager19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> examScores = new ArrayList<>();
        while (true) {
            int score = scanner.nextInt();
            if (score < 0) break;
            examScores.add(score);
        }
        Collections.sort(examScores);
        for (int i = 0; i < examScores.size(); i++) {
            System.out.print(examScores.get(i));
            if (i != examScores.size() - 1) System.out.print(" ");
        }
    }
}
