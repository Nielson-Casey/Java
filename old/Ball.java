package old;

public class Ball {

	private String smooth = "Smooth" ;
	private String round =  "Round";
	private double size = 5;
	private String desc;
	Ball()
	{	
	}
	
	Ball(String newRadius)
	{
		round = newRadius;
	}
	Ball(double number)
	{
		size = number;
	}
	public void setDescription()
	{
		
		desc =  smooth + round;
		
	}

	public String toString()
	{
		return desc;
	}
}
