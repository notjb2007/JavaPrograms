import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("Buffered streams are faster.");
            bw.newLine();
            bw.write("They reduce I/O operations.");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
