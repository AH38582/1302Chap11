
public class Triangle extends Shape {
	private double sideA, sideB, sideC;

	public Triangle() {
		setNumOfSides(3);
		setSideA(1.0);
		setSideB(1.0);
		setSideC(1.0);
	}

	public Triangle(double sideA, double sideB, double sideC) {
		this();
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public double getSemiPerimeter() {
		return (getSideA() + getSideB() + getSideC()) / 2;
	}
	
	@Override
	public double getArea() {
		return Math.sqrt(getSemiPerimeter() * (getSemiPerimeter()-getSideA()) * (getSemiPerimeter() - getSideB()) * (getSemiPerimeter() - getSideC()));
	}
	
	@Override
	public String toString() {
		return String.format("""
				%sSide A: %.2f
				Side B: %.2f
				Side C: %.2f
				""".formatted(super.toString(), getSideA(), getSideB(), getSideC()));
	}
	

}
