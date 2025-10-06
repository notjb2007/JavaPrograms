import java.io.FileWriter;
import java.io.IOException;

public class OverwriteExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("myFile.txt")) {
            writer.write("Hello World."); // This is the first write.
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("myFile.txt")) {
            writer.write("Goodbye Moon!"); // This second write overwrites the first.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}