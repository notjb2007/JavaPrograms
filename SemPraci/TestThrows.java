import java.io.*;

class TestThrows {
    void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt"); // may cause FileNotFoundException
        fr.read();
    }

    public static void main(String[] args) {
        TestThrows t = new TestThrows();
        try {
            t.readFile();
        } catch (IOException e) {
            System.out.println("File handling error: " + e);
        }
    }
}
