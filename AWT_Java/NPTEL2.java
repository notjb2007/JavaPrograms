import javax.swing.*;

public class NPTEL2 extends JFrame {
    JButton button;

    public NPTEL2() {
        button = new JButton("Programming in Java");
        add(button);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NPTEL2();
    }
}
