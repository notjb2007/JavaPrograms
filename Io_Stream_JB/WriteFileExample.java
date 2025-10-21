//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class WriteFileExample {
    public static void main(String[] args) {
        // try {
        //     FileOutputStream fos = new FileOutputStream("output.txt");
        //     String data = "Hello, Byte Streams!";
        //     fos.write(data.getBytes()); // converts string to byte array
        //     fos.close();
        //     System.out.println("Data written successfully.");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        try {
            FileInputStream fis = new FileInputStream("output.txt");
            int read_data;
            while((read_data = fis.read())!=-1){
                System.out.print((char) read_data);
            }
            fis.close();
            System.out.println("Data Read Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
