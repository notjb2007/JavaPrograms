import java.io.*;
public class BufferedReadStre {
    public static void main(String[] args) {
        // try{
        //     FileInputStream fis = new FileInputStream("output.txt");
        //     BufferedInputStream bis = new BufferedInputStream(fis);

        //     int data;
        //     while((data = bis.read())!=-1){
        //         System.out.print((char)data);
        //     }
        //     fis.close();
        //     bis.close();
        // }catch(IOException e){
        //     e.printStackTrace();
        // }

        try {
            FileOutputStream fos = new FileOutputStream("manno.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String data_write = "Hello This is Java Programming, I am Programming in Java LOL";
            bos.write(data_write.getBytes());
            bos.close();
            fos.close();
            System.out.println("Buffered is Written successfully man");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Buffered Reading has been done successfully");
    }
}
