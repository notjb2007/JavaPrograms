import java.io.File;
import java.io.IOException;

public class FileMetadataExample {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        try {
            // Create a new file
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Get file information
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Is it a file? " + myFile.isFile());

            // Delete the file
            // myFile.delete();
            // System.out.println("File deleted.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}