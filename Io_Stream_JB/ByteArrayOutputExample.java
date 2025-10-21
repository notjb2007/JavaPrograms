import java.io.*;

public class ByteArrayOutputExample {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            String data = "Hello Java Stream!";
            baos.write(data.getBytes());

            // Convert to byte array
            byte[] byteData = baos.toByteArray();

            // Convert to string
            String output = baos.toString();
            
            System.out.println("Data in memory (as String): " + output);
            System.out.println("Size of data: " + baos.size());

            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
