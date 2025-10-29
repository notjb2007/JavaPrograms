import java.util.*;

public class Experiment12_CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[3];

        try {
            for (int i = 0; i < 3; i++) {
                String line = sc.nextLine();
                // Try parsing input to double
                marks[i] = Double.parseDouble(line);
                // Check for marks out of bounds
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Error: Invalid input. Marks should be between 0 and 100.");
                    return;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid numeric marks.");
            return;
        }

        double average = (marks[0] + marks[1] + marks[2]) / 3.0;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else
            grade = 'D';

        System.out.println(grade);
    }
}
