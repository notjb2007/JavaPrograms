import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try {
            // Writing data
            FileWriter fw = new FileWriter("note.txt");
            fw.write("Hello Java Character Streams!");
            fw.close();

            // Reading data
            FileReader fr = new FileReader("note.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
