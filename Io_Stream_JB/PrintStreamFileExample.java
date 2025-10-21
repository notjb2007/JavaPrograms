import java.io.*;

public class PrintStreamFileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");

            // 'true' enables auto-flush after every println
            PrintStream ps = new PrintStream(fos, true);

            ps.println("=== Student Details ===");
            ps.println("Name: John Doe");
            ps.println("Age: 21");
            ps.println("Department: Computer Science");
            ps.println("Percentage: 89.75%");
            ps.print("Passed: ");
            ps.println(true);

            ps.flush();
            ps.close();
            fos.close();

            System.out.println("Data written successfully to student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
