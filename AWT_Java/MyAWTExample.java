import java.awt.*;
public class MyAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button b = new Button("Click me");
        b.setBounds(100,100,80,30);
        frame.add(b);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
