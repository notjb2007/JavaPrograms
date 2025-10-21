import java.io.*;

public class PrintStreamExample2 {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("output.txt");

            ps.println("This is written using PrintStream.");
            ps.println(2025);
            ps.println(45.67);
            ps.println(true);
            ps.close();

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
