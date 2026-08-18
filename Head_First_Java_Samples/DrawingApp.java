import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(20, 50, 100, 100);
    }
}

public class DrawingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 950);
        frame.add(panel);
        frame.setVisible(true);
    }
}
