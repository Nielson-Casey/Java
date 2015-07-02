package house;
import java.awt.event.*;
import javax.swing.*;

public class ClockWork extends JFrame {

	private StillClock clock = new StillClock();
	
	public ClockWork()
	{
		add(clock);
		
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}
	private class TimerListener implements ActionListener{
		@Override 
		public void actionPerformed(ActionEvent e)
		{
			clock.setCurrentTime();
			clock.repaint();
		}
		
	}
	

}
