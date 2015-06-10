package inheritance;

public class Box {

	public static void main(String[] args) {
		GeometricObject def = new GeometricObject();
		System.out.println(def.toString());
		Circle circle1 = new Circle(12,"blue",true);
		
		//circle1.setRadius(10);
		circle1.printCircle();
		
		Rectangle cube = new Rectangle(2, 4);
		
		
		System.out.println("this is the " + cube.toString());
		
		System.out.println("Finished");
	}

}
