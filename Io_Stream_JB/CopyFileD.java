import java.io.*;
public class CopyFileD {
    public static void main(String[] args) {
        try {
            FileInputStream source= new FileInputStream("output.txt");
            FileOutputStream destination = new FileOutputStream("Test.txt");

            int data;
            while ((data = source.read())!= -1) {
                destination.write(data);
            }
            source.close();
            destination.close();

            System.out.println("File COpied to successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
