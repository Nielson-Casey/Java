package old;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class month {

	public static void main(String[] args) {
		//String output;
		Ball BigBall = new Ball(5);
		JFrame frame1 = new JFrame();
		frame1.setTitle("Welcome to Ship!");
		frame1.setSize(300, 300);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox<String> box = new JComboBox<String>(new String[]{"Casey","Connolly","Nielson"});
		JPanel panel = new JPanel();
		panel.add(box);
		frame1.add(panel);
		frame1.setVisible(true);
		
		
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		System.out.println(tv1.toString());
		Stack stacker = new Stack();

		
		for(int i = 0; i < 10; i++)
			stacker.push(i);
		while(!stacker.empty())
		System.out.println(stacker.pop()+" ");
		
		
		
		System.out.println(BigBall.toString());
		System.out.println("Finished");
	}

}
