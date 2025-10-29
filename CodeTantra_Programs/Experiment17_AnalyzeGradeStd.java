import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Experiment17_AnalyzeGradeStd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            if (!fileScanner.hasNextLine()) {
                fileScanner.close();
                System.out.println("Error reading file");
                return;
            }
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            double sum = 0;
            int min = 101;
            int max = -1;
            int count = 0;

            for (String s : parts) {
                s = s.trim();
                // Check for non-numeric/invalid grades
                if (!s.matches("\\d+")) {
                    System.out.println("Error reading file");
                    fileScanner.close();
                    return;
                }
                int val = Integer.parseInt(s);

                if (val < 0 || val > 100) {
                    System.out.println("Error reading file");
                    fileScanner.close();
                    return;
                }

                sum += val;
                min = Math.min(min, val);
                max = Math.max(max, val);
                count++;
            }
            fileScanner.close();
            // Output if at least one grade exists
            if (count > 0) {
                double avg = sum / count;
                System.out.printf("Average Grade: %.2f\n", avg);
                System.out.println("Highest Grade: " + max);
                System.out.println("Lowest Grade: " + min);
            } else {
                System.out.println("Error reading file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
