import java.io.FileWriter;
import java.io.IOException;

public class AppendExample {
    public static void main(String[] args) {
        // The 'true' flag enables append mode.
        try (FileWriter writer = new FileWriter("myFile.txt", true)) {
            writer.write("Hello World.\n"); // Note the 'true'
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("myFile.txt", true)) {
            writer.write("Goodbye Moon!\n"); // This will be added to the end.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}