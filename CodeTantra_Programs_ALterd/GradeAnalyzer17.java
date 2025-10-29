import java.io.*;
import java.util.*;

public class GradeAnalyzer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line == null || line.trim().isEmpty()) {
                System.out.println("File is empty");
                return;
            }
            String[] gradeStrings = line.split(",");
            double sum = 0;
            int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
            for (String gradeStr : gradeStrings) {
                int grade = Integer.parseInt(gradeStr.trim());
                sum += grade;
                if (grade > highest) highest = grade;
                if (grade < lowest) lowest = grade;
            }
            double average = sum / gradeStrings.length;
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        } catch (IOException e) {
            System.out.println("File does not exist");
        } catch (NumberFormatException e) {
            System.out.println("Error reading file");
        }
    }
}
