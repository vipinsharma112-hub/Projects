import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient =
            new GradientPaint(
                70, 70, Color.blue,
                150, 150, Color.orange
            );

        g2d.setPaint(gradient);

        g2d.fillOval(70, 70, 100, 100);
    }
}

public class GradientCircleApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        MyDrawPanel panel = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setVisible(true);
    }
}
