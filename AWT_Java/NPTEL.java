import javax.swing.*;

public class NPTEL {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.add(new JButton("OK"));
        frame.add(new JButton("Cancel"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
