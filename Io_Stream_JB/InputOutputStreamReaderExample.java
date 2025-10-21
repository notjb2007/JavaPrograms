import java.io.*;

public class InputOutputStreamReaderExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("Character Stream through Byte Stream bridge!");
            osw.close();

            FileInputStream fis = new FileInputStream("sample.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            int ch;
            while ((ch = isr.read()) != -1) {
                System.out.print((char) ch);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
