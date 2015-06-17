package house;

import java.util.ArrayList;
import java.util.HashMap;

public class Memory {

	//Declaring Variables 
	int five = 5;
	
	String yes = "yes";
	
	double [] numbers = {1,2,3,4,5};
	
	double [][] num = new double[5][3] ;
		
	HashMap<String ,String > map = new HashMap<String,String>();
	
	ArrayList<String> list = new ArrayList<String>();
	
	// Logic
	public Memory(){};
	
	public int logic()
	{
		
		
		
		switch (yes) 
		{
		case "no":	
			System.out.println("Something went wrong!");
		    break;
		case "maybe":
			System.out.println("Something went wrong!");
			break;
		case "yes" :
			System.out.println("Something went right!");
			break;
		default:
			System.out.println("Something went wrong!");
			break;
		}
		
	
		for (int i = 0; five > i; i++)
		{
			System.out.println("I can count to " + i);
		}
		
		while(five > 6)
		{
			System.out.println("I count the same number five " + five + " times.");
		}
		
		return five;
	}

	
	


	
}

