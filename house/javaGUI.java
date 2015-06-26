package house;

import java.awt.BorderLayout;
//import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class javaGUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JButton jbtCtn = new JButton("Center");
		JButton jbtNo = new JButton("North");
		JButton jbtSo = new JButton("South");
		JButton jbtEa = new JButton("East");
		JButton jbtWe = new JButton("West");
		
		ImageIcon img = new ImageIcon("C:\\Users\\computer\\Desktop\\luna.png");
		
		
		//BorderLayout borders = new BorderLayout(5,10);
		
		
		JPanel pnlinput = new JPanel();

		pnlinput.setLayout(new BorderLayout(3, 2));
		
		JFrame frame = new JFrame("My Window");
		
		
		
		frame.add(jbtCtn);
		frame.add(jbtNo);
		frame.add(jbtSo);
		frame.add(jbtEa);
		frame.add(jbtWe);
		
		//frame.BorderLayout.EAST;
		
		frame.setIconImage(img.getImage());
		
		frame.pack();
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	}

}
