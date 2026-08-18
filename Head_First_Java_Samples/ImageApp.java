import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image image = new ImageIcon("catzilla.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}

public class ImageApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        MyDrawPanel panel = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000, 2000);
        frame.add(panel);
        frame.setVisible(true);
    }
}
