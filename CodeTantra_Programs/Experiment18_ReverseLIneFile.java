import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Experiment18_ReverseLIneFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        List<String> lines = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
            fileScanner.close();

            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to read the file");
        }
    }
}
