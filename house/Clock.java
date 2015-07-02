package house;

import javax.swing.JFrame;



public class Clock  {

	public static void main(String[] args) {
		
		JFrame frame = new ClockWork();
		frame.setTitle("ClockAnimation");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
