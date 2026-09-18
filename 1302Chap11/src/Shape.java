
public class Shape {
	private int numOfSides;
	
	public Shape() {
		this(0);
	}
	
	public Shape(int numOfSides) {
		setNumOfSides(numOfSides);
	}

	public int getNumOfSides() {
		return numOfSides;
	}

	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	
	public double getArea() {
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("""
				Number of Sides: %d
				""".formatted(getNumOfSides()));
	}
}
