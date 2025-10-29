import java.io.*;
import java.util.*;

public class ReverseFileContent18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file");
        }
    }
}
