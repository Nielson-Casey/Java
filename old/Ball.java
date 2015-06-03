package old;

public class Ball {

	private String smooth = "Smooth" ;
	private String round =  "Round";
	private double size = 5;
	
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
	private String Description()
	{
		String desc;
		desc =  smooth + round;
		return desc;
	}

}
