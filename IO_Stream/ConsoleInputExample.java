import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");

        // Chain the streams together: System.in -> InputStreamReader -> BufferedReader
        try (
            InputStreamReader byteToCharReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(byteToCharReader)
        ) {
            String name = reader.readLine(); // Read a full line of text
            System.out.println("Hello, " + name + "!");

        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}