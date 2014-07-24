package intro;

public class HelloWorldCh1 {

	public static void main(String[] args)
	{
	// 1.1 Hello World	
	System.out.println("Hello World\n");
	
	// 1.2 print the message out 5 times.
	for (int i = 0; i < 5; i++)
	{
		// Prints out 5 times
		System.out.println("Welcome to Java");		 
			
	}
	
	// 1.3 JAVA
	System.out.println("\n");
	System.out.println("    J     A    V     V    A");		
	System.out.println("    J    A A    V   V    A A");	
	System.out.println("J   J   AAAAA    V V    AAAAA");	
	System.out.println(" J J   A     A    V    A     A");
	System.out.println("\n");
	
	// 1.4
	System.out.println("a   a^2   a^3");
	for (int i = 1; i < 5; i++)
	{
		int a = i;
		int b = i;
		System.out.print(a + "    "  ); 
		a = a * b;
		System.out.print(a + "    "  );  
		a = a * b;		 
		System.out.print(a + "    "  ); 
		 
		System.out.println("\n");
	}
	
	// 1.5 Expressions
	double total = 0;
	total = (9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5);
	System.out.println(total);
	
	// 1.6 Summation
	System.out.println(1+2+3+4+5+6+7+8+9);
	
	// 1.7 Pi
	double pi = 0;
	pi = 22/7;
	System.out.println(pi);
	
	// 1.8
	double para = 0;
	double area = 0;
	double radius = 5.5;
	para = 2 * radius * Math.PI;
	area = radius * radius * Math.PI;
	System.out.println("Parimeter = " + para + "   Area = " + area);
    
	// 1.9
	double width = 4.5;
	double height = 7.9;
	
	
	area = width * height;
	para = width + width + height + height;
	System.out.println("Parimeter = " + para + "   Area = " + area);
	
	// 1.10 average miles
	
	
	double miles = 0.621371 * 14; 
	double mph = miles / .75;
	System.out.println(mph + " " + miles);
	
	// 1.11 Population 312032486
	double population = 312032486;
	double yearBirth = (((365 * 24) * 60) * 60);  
	double yeardeath = (((365 * 24) * 60) * 60); 
	double yearImma = (((365 * 24) * 60) * 60); 
	double birth = yearBirth / 7;
	double death = yeardeath / 13;
	double imma = yearImma / 45;
	
	System.out.println(population);
	double total1 = (population + birth + imma) - death ; 
	double total2 = 0;
	for (int i = 0; i < 5; i++)
	{
	
	total1 += (population + birth + imma) - death ;
	total2 += (((total1 / 60) / 60) / 60);
	System.out.println(total2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
