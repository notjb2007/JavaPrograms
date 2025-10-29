import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Experiment16_FileEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        int charCount = 0;

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            StringBuilder content = new StringBuilder();

            while (fileScanner.hasNextLine()) {
                content.append(fileScanner.nextLine());
                // Preserve line breaks if they count toward the character count
                // content.append("\n");
            }
            fileScanner.close();

            charCount = content.length();

            if (charCount <= 250) {
                System.out.println("Abstract is eligible for submission");
            } else {
                System.out.println("Abstract is not eligible for submission");
            }
            System.out.println(charCount);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
