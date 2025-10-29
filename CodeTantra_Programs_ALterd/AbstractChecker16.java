import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AbstractChecker16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        File file = new File(fileName);
        try {
            Scanner fileScanner = new Scanner(file);
            StringBuilder content = new StringBuilder();
            while (fileScanner.hasNextLine())
                content.append(fileScanner.nextLine());
            fileScanner.close();
            int charCount = content.length();
            if (charCount <= 250)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
            System.out.println("Character count " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
