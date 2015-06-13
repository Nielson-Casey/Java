package house;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class javaGUI {

	public static void main(String[] args) {
		
		
		
		JFrame frame = new JFrame("My Window");
		
		JButton jbtOK = new JButton("OK");
		ImageIcon img = new ImageIcon("C:\\Users\\computer\\Desktop\\luna.png");
	
		
		frame.add(jbtOK);
		frame.setIconImage(img.getImage());
		
		
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	}

}
