
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TwoButtons2 {
	private JFrame frame;
	private JLabel label;
	public static void main(String[] args){
		TwoButtons gui=new TwoButtons();
		gui.go();
	}
	public void go(){
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton=new JButton("Change Label");
		labelButton.addActionListener(event -> label.setText("outch!"));

		JButton colorButton=new JButton("Change Circle");
		colorButton.addActionListener(event -> frame.repaint());
		
		label=new JLabel("I'm a label");

		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);

		frame.setSize(520,400);
		frame.setVisible(true);
	}
	
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.orange);
			g.fillOval(70, 70, 100, 100);
		}
	}
}
