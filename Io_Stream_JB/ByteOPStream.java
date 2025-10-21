import java.io.*;
public class ByteOPStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("ByteOp.txt");
            String s = "Generative AT Prompt Engineering";
            ByteArrayOutputStream b1 = new ByteArrayOutputStream();

            b1.write(s.getBytes());
            b1.write(s.getBytes());;
            b1.writeTo(fos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
