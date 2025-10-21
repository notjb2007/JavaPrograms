import java.io.*;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] data = {65, 66, 67, 68, 69}; // A B C D E
        ByteArrayInputStream bais = new ByteArrayInputStream(data);

        System.out.println("Available: " + bais.available());

        // Mark and Read
        bais.mark(0);
        System.out.println((char) bais.read()); // A
        System.out.println((char) bais.read()); // B

        // Reset to mark
        bais.reset();
        System.out.println("After reset: " + (char) bais.read()); // A again

        // Skip 2 bytes
        bais.skip(2);
        System.out.println("After skip: " + (char) bais.read()); // D

        System.out.println("Available now: " + bais.available());
        bais.close();
    }
}
