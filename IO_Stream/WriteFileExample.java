import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        String[] linesToWrite = {
            "Java I/O streams are powerful.",
            "Character streams are for text.",
            "Byte streams are for binary data."
        };

        // Use try-with-resources to ensure the writer is automatically closed
        try (
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (String line : linesToWrite) {
                bufferedWriter.write(line); // Write the string to the buffer
                bufferedWriter.newLine();   // Write a new line character
            }
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}