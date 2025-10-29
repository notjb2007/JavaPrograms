import java.util.Scanner;

public class GradeCalculator12 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double math = readValidMarks(sc);
            double science = readValidMarks(sc);
            double english = readValidMarks(sc);
            double av = (math + science + english) / 3;
            char grade;
            if (av >= 90)
                grade = 'A';
            else if (av >= 80)
                grade = 'B';
            else if (av >= 70)
                grade = 'C';
            else
                grade = 'D';
            System.out.println(grade);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println("Marks should be between 0 and 100");
        }
    }
    private static double readValidMarks(Scanner sc) {
        String in = sc.nextLine().trim();
        if (in.startsWith("[") && in.endsWith("]")) {
            in = in.substring(1, in.length() - 1);
        }
        try {
            double m = Double.parseDouble(in);
            if (m < 0 || m > 100)
                throw new IllegalArgumentException();
            return m;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
}
