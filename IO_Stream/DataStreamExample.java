import java.io.*;

public class DataStreamExample {

    public static void main(String[] args) {
        // First, write the data using DataOutputStream
        writeData();

        // Second, read the data back using DataInputStream
        readData();
    }

    public static void writeData() {
        // Using try-with-resources ensures the stream is closed automatically
        try (
            FileOutputStream fos = new FileOutputStream("inventory.bin");
            DataOutputStream dos = new DataOutputStream(fos)
        ) {
            // Write various primitive types and a String
            dos.writeInt(123);           // An item ID
            dos.writeDouble(19.99);      // The price
            dos.writeUTF("Gaming Mouse"); // The item name

            System.out.println("Data written to inventory.bin successfully.");

        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }
    }

    public static void readData() {
        System.out.println("\nReading data from inventory.bin:");

        try (
            FileInputStream fis = new FileInputStream("inventory.bin");
            DataInputStream dis = new DataInputStream(fis)
        ) {
            // IMPORTANT: You MUST read the data in the exact same order it was written.
            int itemId = dis.readInt();
            double price = dis.readDouble();
            String itemName = dis.readUTF();

            System.out.println("Item ID: " + itemId);
            System.out.println("Price: $" + price);
            System.out.println("Item Name: " + itemName);

        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}