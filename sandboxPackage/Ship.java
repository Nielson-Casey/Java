package sandboxPackage;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Ship extends JFrame {

	public static void main(String[] args){
		try {
			// Set the GUI look and feel to the same as the system.
			String laf = UIManager.getSystemLookAndFeelClassName();
			UIManager.setLookAndFeel(laf);
		}
		catch (Exception ex) { /* Do nothing */ }
		Ship frame = new Ship();
		
	}
	
	private final double[] numbers = {1,2,3,4,5}; 
	private final String[] letters = {"one","two","three","four","five"};
	private JTextField first;
	private JTextField second;
    private JTextField third;
    
	public Ship()
	{
		
		JLabel lblFirst = new JLabel ("FIRST");
		first = new JTextField(5);	
		first.setEditable(false);
		
		JLabel lblSecond = new JLabel ("SECOND");
		second = new JTextField(20);
		second.setEditable(false);
	
		//this will give you the answer to "what is the meaning of life?"
		JPanel pnlinput = new JPanel();
		
		pnlinput.setLayout(new GridLayout(10, 10));
		pnlinput.add(lblFirst);
		pnlinput.add(lblSecond);
		
		
		// Not sure what this is for
		//JPanel pnlProducts = new JPanel();
		//pnlProducts.setLayout(new GridLayout(10,10));
		
		//pnlProducts.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		this.setTitle("Holy SHIP!");
		this.setContentPane(pnlinput);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
