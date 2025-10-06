import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // We use a try-with-resources block to auto-close the streams
        try (
            // 1. Basic stream to read the file's raw bytes as characters
            FileReader fileReader = new FileReader("myTextFile.txt");

            // 2. Wrap it in a BufferedReader for efficiency and the readLine() method
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            // readLine() returns null when the end of the file is reached
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}