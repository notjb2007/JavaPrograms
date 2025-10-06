import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the writer is automatically closed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("greeting.txt"))) {
            writer.write("Man You Suck! Said by franklin nigg");
            writer.newLine();
            writer.write("File handling is essential.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}