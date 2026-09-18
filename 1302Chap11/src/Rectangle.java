
public class Rectangle extends Shape {
//length, width
	private double length, width;

	public Rectangle() {
		setNumOfSides(4);
		setLength(1.0);
		setWidth(1.0);
	}

	public Rectangle(double length, double width) {
		this();
		setLength(length);
		setWidth(width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

//	getArea(), getPerim()

	@Override
	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return length + length + width + width;
	}

	@Override
	public String toString() {
		return String.format("""
				%sLength: %.2f
				Width: %.2f
				""".formatted(super.toString(), getLength(), getWidth()));
	}
	
	

}
