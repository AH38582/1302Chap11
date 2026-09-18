
public class ShapeTest {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println(s1);
		
		Triangle t1 = new Triangle();
		System.out.print(t1);
		System.out.println(t1.getArea());
		
		System.out.println();
		
		Rectangle r1 = new Rectangle(2.0, 6.0); 
		System.out.print(r1);
		System.out.println(r1.getArea());
		
		
			
	}

}
